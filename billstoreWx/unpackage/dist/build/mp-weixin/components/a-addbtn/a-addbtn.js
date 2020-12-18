(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["components/a-addbtn/a-addbtn"],{"3edc":function(t,e,n){"use strict";var a=n("8601"),c=n.n(a);c.a},"41c5":function(t,e,n){"use strict";n.r(e);var a=n("5955"),c=n.n(a);for(var i in a)"default"!==i&&function(t){n.d(e,t,(function(){return a[t]}))}(i);e["default"]=c.a},5955:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var a={name:"AAddbtn",data:function(){return{bottom:20,right:20,pageX:0,pageY:0,ismove:!1}},methods:{start:function(t){var e=t.changedTouches[0];this.pageX=e.pageX,this.pageY=e.pageY},move:function(t){var e=this.pageX,n=this.pageY,a=this.bottom,c=this.right,i=t.changedTouches[0],u=i.pageX-e,o=i.pageY-n;this.pageX=i.pageX,this.pageY=i.pageY,this.right=c-u,this.bottom=a-o},end:function(t){t.changedTouches[0]},handleClick:function(){this.$emit("add-btn-click")}}};e.default=a},5981:function(t,e,n){"use strict";n.r(e);var a=n("e299"),c=n("41c5");for(var i in c)"default"!==i&&function(t){n.d(e,t,(function(){return c[t]}))}(i);n("3edc");var u,o=n("f0c5"),r=Object(o["a"])(c["default"],a["b"],a["c"],!1,null,"7a4d73ca",null,!1,a["a"],u);e["default"]=r.exports},8601:function(t,e,n){},e299:function(t,e,n){"use strict";var a;n.d(e,"b",(function(){return c})),n.d(e,"c",(function(){return i})),n.d(e,"a",(function(){return a}));var c=function(){var t=this,e=t.$createElement;t._self._c},i=[]}}]);
;(global["webpackJsonp"] = global["webpackJsonp"] || []).push([
    'components/a-addbtn/a-addbtn-create-component',
    {
        'components/a-addbtn/a-addbtn-create-component':(function(module, exports, __webpack_require__){
            __webpack_require__('543d')['createComponent'](__webpack_require__("5981"))
        })
    },
    [['components/a-addbtn/a-addbtn-create-component']]
]);
