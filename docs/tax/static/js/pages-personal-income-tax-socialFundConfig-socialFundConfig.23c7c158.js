(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-personal-income-tax-socialFundConfig-socialFundConfig"],{2237:function(e,n,t){(function(e){function n(e){return n="function"===typeof Symbol&&"symbol"===typeof Symbol.iterator?function(e){return typeof e}:function(e){return e&&"function"===typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":typeof e},n(e)}!function(t,a){"object"===n(e)&&e.exports?e.exports=a():t.onfire=a()}("undefined"!==typeof window?window:this,function(){var e={},t=0,a="string",i="function",s=Function.call.bind(Object.hasOwnProperty),l=Function.call.bind(Array.prototype.slice);function u(l,u,c,r){if(n(l)!==a||n(u)!==i)throw new Error("args: "+a+", "+i);return s(e,l)||(e[l]={}),e[l][++t]=[u,c,r],[l,t]}function c(e,n){for(var t in e)s(e,t)&&n(t,e[t])}function r(e,n,t){return u(e,n,0,t)}function o(e,n,t){return u(e,n,1,t)}function d(n,t){s(e,n)&&c(e[n],function(a,i){i[0].apply(i[2],t),i[1]&&delete e[n][a]})}function p(e){var n=l(arguments,1);setTimeout(function(){d(e,n)})}function v(e){d(e,l(arguments,1))}function m(t){var l,u,r=!1,o=n(t);return o===a?!!s(e,t)&&(delete e[t],!0):"object"===o?(l=t[0],u=t[1],!(!s(e,l)||!s(e[l],u))&&(delete e[l][u],!0)):o!==i||(c(e,function(n,a){c(a,function(a,i){i[0]===t&&(delete e[n][a],r=!0)})}),r)}function h(){e={}}return{on:r,one:o,un:m,fire:p,fireSync:v,clear:h}})}).call(this,t("62e4")(e))},"3d9c":function(e,n,t){"use strict";t.r(n);var a=function(){var e=this,n=e.$createElement,t=e._self._c||n;return t("v-uni-view",[t("v-uni-scroll-view",{staticClass:"page-body",style:{height:e.winHeight+"px;"},attrs:{"scroll-y":"true"}},[t("v-uni-view",{staticClass:"page-section"},[t("v-uni-view",{staticClass:"page-section-title"},[t("v-uni-text",[e._v("温馨提示：可修改社保公积金基数比例，点击确定保存 \\n")]),t("v-uni-text",[e._v(e._s(e.data.info))])],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("城市")]),t("v-uni-input",{attrs:{placeholder:"请输入城市"},model:{value:e.city.label,callback:function(n){e.$set(e.city,"label",n)},expression:"city.label"}})],1)],1)],1),t("v-uni-view",{staticClass:"page-section"},[t("v-uni-view",{staticClass:"page-section-title"},[e._v("养老保险")]),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("个人缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.endowmentInsurance.personPercent,callback:function(n){e.$set(e.data.endowmentInsurance,"personPercent",n)},expression:"data.endowmentInsurance.personPercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("企业缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.endowmentInsurance.enterprisePercent,callback:function(n){e.$set(e.data.endowmentInsurance,"enterprisePercent",n)},expression:"data.endowmentInsurance.enterprisePercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数上限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.endowmentInsurance.highBase,callback:function(n){e.$set(e.data.endowmentInsurance,"highBase",n)},expression:"data.endowmentInsurance.highBase"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数下限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.endowmentInsurance.lowBase,callback:function(n){e.$set(e.data.endowmentInsurance,"lowBase",n)},expression:"data.endowmentInsurance.lowBase"}})],1)],1)],1),t("v-uni-view",{staticClass:"page-section"},[t("v-uni-view",{staticClass:"page-section-title"},[e._v("医疗保险")]),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("个人缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.medicalInsurance.personPercent,callback:function(n){e.$set(e.data.medicalInsurance,"personPercent",n)},expression:"data.medicalInsurance.personPercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("企业缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.medicalInsurance.enterprisePercent,callback:function(n){e.$set(e.data.medicalInsurance,"enterprisePercent",n)},expression:"data.medicalInsurance.enterprisePercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数上限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.medicalInsurance.highBase,callback:function(n){e.$set(e.data.medicalInsurance,"highBase",n)},expression:"data.medicalInsurance.highBase"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数下限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.medicalInsurance.lowBase,callback:function(n){e.$set(e.data.medicalInsurance,"lowBase",n)},expression:"data.medicalInsurance.lowBase"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("补充金额")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.medicalInsurance.delta,callback:function(n){e.$set(e.data.medicalInsurance,"delta",n)},expression:"data.medicalInsurance.delta"}})],1)],1)],1),t("v-uni-view",{staticClass:"page-section"},[t("v-uni-view",{staticClass:"page-section-title"},[e._v("生育保险")]),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("个人缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.maternityInsurance.personPercent,callback:function(n){e.$set(e.data.maternityInsurance,"personPercent",n)},expression:"data.maternityInsurance.personPercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("企业缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.maternityInsurance.enterprisePercent,callback:function(n){e.$set(e.data.maternityInsurance,"enterprisePercent",n)},expression:"data.maternityInsurance.enterprisePercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数上限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.maternityInsurance.highBase,callback:function(n){e.$set(e.data.maternityInsurance,"highBase",n)},expression:"data.maternityInsurance.highBase"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数下限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.maternityInsurance.lowBase,callback:function(n){e.$set(e.data.maternityInsurance,"lowBase",n)},expression:"data.maternityInsurance.lowBase"}})],1)],1)],1),t("v-uni-view",{staticClass:"page-section"},[t("v-uni-view",{staticClass:"page-section-title"},[e._v("失业保险")]),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("个人缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.unemploymentInsurance.personPercent,callback:function(n){e.$set(e.data.unemploymentInsurance,"personPercent",n)},expression:"data.unemploymentInsurance.personPercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("企业缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.unemploymentInsurance.enterprisePercent,callback:function(n){e.$set(e.data.unemploymentInsurance,"enterprisePercent",n)},expression:"data.unemploymentInsurance.enterprisePercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数上限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.unemploymentInsurance.personPercent,callback:function(n){e.$set(e.data.unemploymentInsurance,"personPercent",n)},expression:"data.unemploymentInsurance.personPercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数下限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.unemploymentInsurance.highBase,callback:function(n){e.$set(e.data.unemploymentInsurance,"highBase",n)},expression:"data.unemploymentInsurance.highBase"}})],1)],1)],1),t("v-uni-view",{staticClass:"page-section"},[t("v-uni-view",{staticClass:"page-section-title"},[e._v("工伤保险")]),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("个人缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.employmentInjuryInsurance.personPercent,callback:function(n){e.$set(e.data.employmentInjuryInsurance,"personPercent",n)},expression:"data.employmentInjuryInsurance.personPercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("企业缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.employmentInjuryInsurance.enterprisePercent,callback:function(n){e.$set(e.data.employmentInjuryInsurance,"enterprisePercent",n)},expression:"data.employmentInjuryInsurance.enterprisePercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数上限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.employmentInjuryInsurance.highBase,callback:function(n){e.$set(e.data.employmentInjuryInsurance,"highBase",n)},expression:"data.employmentInjuryInsurance.highBase"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数下限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.employmentInjuryInsurance.lowBase,callback:function(n){e.$set(e.data.employmentInjuryInsurance,"lowBase",n)},expression:"data.employmentInjuryInsurance.lowBase"}})],1)],1)],1),t("v-uni-view",{staticClass:"page-section"},[t("v-uni-view",{staticClass:"page-section-title"},[e._v("住房公积金")]),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("个人缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.housingFundInsurance.personPercent,callback:function(n){e.$set(e.data.housingFundInsurance,"personPercent",n)},expression:"data.housingFundInsurance.personPercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("企业缴纳比例")]),t("v-uni-input",{attrs:{maxlength:"5",placeholder:"请输入"},model:{value:e.data.housingFundInsurance.enterprisePercent,callback:function(n){e.$set(e.data.housingFundInsurance,"enterprisePercent",n)},expression:"data.housingFundInsurance.enterprisePercent"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数上限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.housingFundInsurance.highBase,callback:function(n){e.$set(e.data.housingFundInsurance,"highBase",n)},expression:"data.housingFundInsurance.highBase"}})],1)],1),t("v-uni-view",{staticClass:"uni-list"},[t("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[t("v-uni-text",[e._v("缴纳基数下限")]),t("v-uni-input",{attrs:{maxlength:"10",placeholder:"请输入"},model:{value:e.data.housingFundInsurance.lowBase,callback:function(n){e.$set(e.data.housingFundInsurance,"lowBase",n)},expression:"data.housingFundInsurance.lowBase"}})],1)],1)],1)],1),t("v-uni-button",{staticClass:"mini-btn",attrs:{type:"primary"},on:{click:function(n){n=e.$handleEvent(n),e.confirm(n)}}},[e._v("确定")])],1)},i=[],s=t("2237"),l=t.n(s),u={data:function(){return{winHeight:0,city:{},data:{city:"",info:"",socialLowBase:"",socialHighBase:"",housingLowBase:"",housingHighBase:"",endowmentInsurance:{title:"养老保险",personPercent:"",enterprisePercent:"",lowBase:"",highBase:""},medicalInsurance:{title:"医疗保险",personPercent:"",enterprisePercent:"",lowBase:"",highBase:"",delta:""},unemploymentInsurance:{title:"失业保险",personPercent:"",enterprisePercent:"",lowBase:"",highBase:""},employmentInjuryInsurance:{title:"工伤保险",personPercent:"0",enterprisePercent:"",lowBase:"",highBase:""},maternityInsurance:{title:"生育保险",personPercent:"0",enterprisePercent:"",lowBase:"",highBase:""},housingFundInsurance:{title:"住房公积金",personPercent:"",enterprisePercent:"",lowBase:"",highBase:""}},defaultData:{city:"",info:"",socialLowBase:3030,socialHighBase:19935,housingLowBase:2020,housingHighBase:25300,endowmentInsurance:{title:"养老保险",personPercent:"8",enterprisePercent:"19",lowBase:3030,highBase:19935},medicalInsurance:{title:"医疗保险",personPercent:"2",enterprisePercent:"9",lowBase:3030,highBase:19935,delta:10},unemploymentInsurance:{title:"失业保险",personPercent:"0.5",enterprisePercent:"0.5",lowBase:3030,highBase:19935},employmentInjuryInsurance:{title:"工伤保险",personPercent:"0",enterprisePercent:"0.5",lowBase:3030,highBase:19935},maternityInsurance:{title:"生育保险",personPercent:"0",enterprisePercent:"0.8",lowBase:3030,highBase:19935},housingFundInsurance:{title:"住房公积金",personPercent:"10",enterprisePercent:"10",lowBase:2020,highBase:25300}}}},onLoad:function(e){var n=uni.getSystemInfoSync().windowHeight;this.winHeight=n-uni.getSystemInfoSync().screenWidth/750*128,this.city=JSON.parse(e.city);var t=JSON.parse(e.socialHousing);if(t&&t.socialLowBase)this.data=t;else try{var a=uni.getStorageSync("socialHousing"+this.city.label);a?this.data=JSON.parse(a):this.loadData()}catch(i){this.loadData()}},methods:{loadData:function(){uni.showNavigationBarLoading();var e=this,n="http://www.airlenet.com/mobile/api/comairlenettaxcalculator/"+encodeURI(this.city.label)+"/socialhousing.json";uni.request({url:n,success:function(n){console.log(JSON.stringify(n)),200==n.statusCode&&n.data?e.data=n.data:(uni.showToast({title:"网络异常，稍后再试!"}),e.data=e.defaultData)},fail:function(n){uni.showModal({content:n.errMsg,showCancel:!1}),e.data=e.defaultData},complete:function(){uni.hideNavigationBarLoading()}})},confirm:function(){var e=this,n=e.data;n.city=this.city.label,n.housingHighBase=e.data.housingFundInsurance.highBase,n.housingLowBase=e.data.housingFundInsurance.lowBase;var t=0;console.log(t+"sss"+Number(e.data.endowmentInsurance.lowBase)),t<Number(e.data.endowmentInsurance.lowBase)&&(t=e.data.endowmentInsurance.lowBase),t<e.data.medicalInsurance.lowBase&&(t=e.data.medicalInsurance.lowBase),t<e.data.unemploymentInsurance.lowBase&&(t=e.data.unemploymentInsurance.lowBase),t<e.data.employmentInjuryInsurance.lowBase&&(t=e.data.employmentInjuryInsurance.lowBase),t<e.data.maternityInsurance.lowBase&&(t=e.data.maternityInsurance.lowBase),n.socialLowBase=t;var a=e.data.endowmentInsurance.highBase;a>e.data.medicalInsurance.highBase&&(a=e.data.medicalInsurance.highBase),a>e.data.unemploymentInsurance.highBase&&(a=e.data.unemploymentInsurance.highBase),a>e.data.employmentInjuryInsurance.highBase&&(a=e.data.employmentInjuryInsurance.highBase),a>e.data.maternityInsurance.highBase&&(a=e.data.maternityInsurance.highBase),n.socialHighBase=a,uni.setStorageSync("socialHousing"+this.city.label,JSON.stringify(n)),l.a.fire("socialHousing",n),uni.navigateBack()}}},c=u,r=(t("67c3"),t("2877")),o=Object(r["a"])(c,a,i,!1,null,"72471708",null);o.options.__file="socialFundConfig.vue";n["default"]=o.exports},"62e4":function(e,n){e.exports=function(e){return e.webpackPolyfill||(e.deprecate=function(){},e.paths=[],e.children||(e.children=[]),Object.defineProperty(e,"loaded",{enumerable:!0,get:function(){return e.l}}),Object.defineProperty(e,"id",{enumerable:!0,get:function(){return e.i}}),e.webpackPolyfill=1),e}},"67c3":function(e,n,t){"use strict";var a=t("eba3"),i=t.n(a);i.a},eba3:function(e,n,t){var a=t("fb63");"string"===typeof a&&(a=[[e.i,a,""]]),a.locals&&(e.exports=a.locals);var i=t("4f06").default;i("2f7147ed",a,!0,{sourceMap:!1,shadowMode:!1})},fb63:function(e,n,t){n=e.exports=t("2350")(!1),n.push([e.i,"\nuni-input[data-v-72471708]{text-align:right\n}",""])}}]);