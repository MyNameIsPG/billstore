(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/basics/clientsAdd/clientsAdd"],{"4c9f":function(e,n,t){"use strict";var u=t("5340"),o=t.n(u);o.a},5340:function(e,n,t){},"7a08":function(e,n,t){"use strict";Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var u={data:function(){var e=this;return{errorType:["toast"],model:{name:"",phone:"",idcard:1},rules:{name:[{required:!0,message:"请输入姓名",trigger:"blur"}],phone:[{required:!0,message:"请输入手机号",trigger:["change","blur"]},{validator:function(n,t,u){return e.$u.test.mobile(t)},message:"手机号码不正确",trigger:["change","blur"]}]}}},onReady:function(){this.$refs.uForm.setRules(this.rules)},methods:{submit:function(){var e=this;this.$refs.uForm.validate((function(n){n?(console.log(e.model),console.log("验证通过")):console.log("验证失败")}))}}};n.default=u},"852f":function(e,n,t){"use strict";(function(e){t("bdfa");u(t("66fd"));var n=u(t("c370"));function u(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},c370:function(e,n,t){"use strict";t.r(n);var u=t("ce69"),o=t("ed8f");for(var r in o)"default"!==r&&function(e){t.d(n,e,(function(){return o[e]}))}(r);t("4c9f");var i,c=t("f0c5"),a=Object(c["a"])(o["default"],u["b"],u["c"],!1,null,"2ebca6a6",null,!1,u["a"],i);n["default"]=a.exports},ce69:function(e,n,t){"use strict";t.d(n,"b",(function(){return o})),t.d(n,"c",(function(){return r})),t.d(n,"a",(function(){return u}));var u={uForm:function(){return t.e("uview-ui/components/u-form/u-form").then(t.bind(null,"ab69"))},uFormItem:function(){return Promise.all([t.e("common/vendor"),t.e("uview-ui/components/u-form-item/u-form-item")]).then(t.bind(null,"0a83"))},uInput:function(){return Promise.all([t.e("common/vendor"),t.e("uview-ui/components/u-input/u-input")]).then(t.bind(null,"73f4"))},uButton:function(){return t.e("uview-ui/components/u-button/u-button").then(t.bind(null,"89a1"))}},o=function(){var e=this,n=e.$createElement;e._self._c},r=[]},ed8f:function(e,n,t){"use strict";t.r(n);var u=t("7a08"),o=t.n(u);for(var r in u)"default"!==r&&function(e){t.d(n,e,(function(){return u[e]}))}(r);n["default"]=o.a}},[["852f","common/runtime","common/vendor"]]]);