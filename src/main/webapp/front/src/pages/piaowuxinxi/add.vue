<template>
<div :style='{"width":"100%","padding":"30px 7% 40px","margin":"10px auto","position":"relative","background":"none","display":"block"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="150px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="票务编号" prop="piaowubianhao">
              <el-input v-model="ruleForm.piaowubianhao" placeholder="票务编号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="票务名称" prop="piaowumingcheng">
            <el-input v-model="ruleForm.piaowumingcheng" 
                placeholder="票务名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="票务类型" prop="piaowuleixing">
            <el-input v-model="ruleForm.piaowuleixing" 
                placeholder="票务类型" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="封面" v-if="type!='cross' || (type=='cross' && !ro.fengmian)" prop="fengmian">
            <file-upload
            tip="点击上传封面"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.fengmian?ruleForm.fengmian:''"
            @change="fengmianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' class="upload" v-else label="封面" prop="fengmian">
                <img v-if="ruleForm.fengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.fengmian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fengmian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="起点" prop="qidian">
            <el-input v-model="ruleForm.qidian" 
                placeholder="起点" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="目的地" prop="mudedi">
            <el-input v-model="ruleForm.mudedi" 
                placeholder="目的地" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="商家账号" prop="shangjiazhanghao">
            <el-input v-model="ruleForm.shangjiazhanghao" 
                placeholder="商家账号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="商家名称" prop="shangjiamingcheng">
            <el-input v-model="ruleForm.shangjiamingcheng" 
                placeholder="商家名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="价格" prop="price">
            <el-input v-model="ruleForm.price" 
                placeholder="价格" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(178,213,232,1) 100%)"}' label="详情" prop="xiangqing">
            <editor 
                :style='{"padding":"0","boxShadow":"0 0 0px rgba(75,223,201,.5)","margin":"0","borderColor":"#ddd","backgroundColor":"#fff","borderRadius":"0","borderWidth":"1px","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.xiangqing" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"20px 0 0","alignItems":"center","justifyContent":"center","display":"flex"}'>
        <el-button :style='{"border":"2px solid #2886bc","cursor":"pointer","padding":"0 35px","boxShadow":"inset 2px 0px 12px 0px #c2ddeb","margin":"0 10px","color":"#2886bc","outline":"none","borderRadius":"8px","background":"#fff","width":"auto","lineHeight":"44px","fontSize":"16px","height":"48px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"2px solid #ccc","cursor":"pointer","padding":"0 35px","boxShadow":"inset 0px 0px 12px 0px #eee","margin":"010px","color":"#999","outline":"none","borderRadius":"8px","background":"#fff","width":"auto","lineHeight":"44px","fontSize":"16px","height":"48px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            piaowubianhao : false,
            piaowumingcheng : false,
            piaowuleixing : false,
            fengmian : false,
            qidian : false,
            mudedi : false,
            xiangqing : false,
            shangjiazhanghao : false,
            shangjiamingcheng : false,
            price : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          piaowubianhao: this.getUUID(),
          piaowumingcheng: '',
          piaowuleixing: '',
          fengmian: '',
          qidian: '',
          mudedi: '',
          xiangqing: '',
          shangjiazhanghao: '',
          shangjiamingcheng: '',
          price: '',
        },
        rules: {
          piaowubianhao: [
          ],
          piaowumingcheng: [
          ],
          piaowuleixing: [
          ],
          fengmian: [
          ],
          qidian: [
          ],
          mudedi: [
          ],
          xiangqing: [
          ],
          shangjiazhanghao: [
          ],
          shangjiamingcheng: [
          ],
          price: [
            { required: true, message: '价格不能为空', trigger: 'blur' },
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
        },
      };
    },
    computed: {



    },
    components: {
    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='piaowubianhao'){
              this.ruleForm.piaowubianhao = obj[o];
              this.ro.piaowubianhao = true;
              continue;
            }
            if(o=='piaowumingcheng'){
              this.ruleForm.piaowumingcheng = obj[o];
              this.ro.piaowumingcheng = true;
              continue;
            }
            if(o=='piaowuleixing'){
              this.ruleForm.piaowuleixing = obj[o];
              this.ro.piaowuleixing = true;
              continue;
            }
            if(o=='fengmian'){
              this.ruleForm.fengmian = obj[o].split(",")[0];
              this.ro.fengmian = true;
              continue;
            }
            if(o=='qidian'){
              this.ruleForm.qidian = obj[o];
              this.ro.qidian = true;
              continue;
            }
            if(o=='mudedi'){
              this.ruleForm.mudedi = obj[o];
              this.ro.mudedi = true;
              continue;
            }
            if(o=='xiangqing'){
              this.ruleForm.xiangqing = obj[o];
              this.ro.xiangqing = true;
              continue;
            }
            if(o=='shangjiazhanghao'){
              this.ruleForm.shangjiazhanghao = obj[o];
              this.ro.shangjiazhanghao = true;
              continue;
            }
            if(o=='shangjiamingcheng'){
              this.ruleForm.shangjiamingcheng = obj[o];
              this.ro.shangjiamingcheng = true;
              continue;
            }
            if(o=='price'){
              this.ruleForm.price = obj[o];
              this.ro.price = true;
              continue;
            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.shangjiazhanghao!=''&&json.shangjiazhanghao) || json.shangjiazhanghao==0){
                this.ruleForm.shangjiazhanghao = json.shangjiazhanghao
            }
            if((json.shangjiamingcheng!=''&&json.shangjiamingcheng) || json.shangjiamingcheng==0){
                this.ruleForm.shangjiamingcheng = json.shangjiamingcheng
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('piaowuxinxi/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('piaowuxinxi/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('piaowuxinxi/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('piaowuxinxi/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
      fengmianUploadChange(fileUrls) {
          this.ruleForm.fengmian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 15px;
	  color: #2886bc;
	  font-weight: 500;
	  width: 150px;
	  font-size: 16px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #ddd;
	  border-radius: 30px;
	  padding: 0 10px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  width: 350px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #ddd;
	  border-radius: 30px;
	  padding: 0 10px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  width: 350px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #ddd;
	  border-radius: 30px;
	  padding: 0 10px 0 30px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #2886bc;
	  width: 350px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed #666;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #666;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed #666;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #666;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed #666;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #666;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ddd;
	  border-radius: 30px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  width: 350px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
