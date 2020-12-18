(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["colorui/components/cu-custom"],{"17db":function(t,n,a){"use strict";(function(t){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var a={data:function(){return{StatusBar:this.StatusBar,CustomBar:this.CustomBar}},name:"cu-custom",computed:{style:function(){var t=this.StatusBar,n=this.CustomBar,a=this.bgImage,e="height:".concat(n,"px;padding-top:").concat(t,"px;");return this.bgImage&&(e="".concat(e,"background-image:url(").concat(a,");")),e}},props:{bgColor:{type:String,default:""},isBack:{type:[Boolean,String],default:!1},bgImage:{type:String,default:""}},methods:{BackPage:function(){if(getCurrentPages().length<2&&"undefined"!==typeof __wxConfig){var n="/"+__wxConfig.pages[0];return t.redirectTo({url:n})}t.navigateBack({delta:1})}}};n.default=a}).call(this,a("543d")["default"])},"23e2":function(t,n,a){"use strict";a.r(n);var e=a("b8d3"),u=a("4a90");for(var r in u)"default"!==r&&function(t){a.d(n,t,(function(){return u[t]}))}(r);var o,c=a("f0c5"),i=Object(c["a"])(u["default"],e["b"],e["c"],!1,null,null,null,!1,e["a"],o);n["default"]=i.exports},"4a90":function(t,n,a){"use strict";a.r(n);var e=a("17db"),u=a.n(e);for(var r in e)"default"!==r&&function(t){a.d(n,t,(function(){return e[t]}))}(r);n["default"]=u.a},b8d3:function(t,n,a){"use strict";var e;a.d(n,"b",(function(){return u})),a.d(n,"c",(function(){return r})),a.d(n,"a",(function(){return e}));var u=function(){var t=this,n=t.$createElement;t._self._c},r=[]}}]);
;(global["webpackJsonp"] = global["webpackJsonp"] || []).push([
    'colorui/components/cu-custom-create-component',
    {
        'colorui/components/cu-custom-create-component':(function(module, exports, __webpack_require__){
            __webpack_require__('543d')['createComponent'](__webpack_require__("23e2"))
        })
    },
    [['colorui/components/cu-custom-create-component']]
]);
