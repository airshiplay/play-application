(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-personal-income-tax-propertytransfer-propertytransfer"],{2880:function(e,t,i){t=e.exports=i("2350")(!1),t.push([e.i,"\n.left-selected[data-v-4bf3a4bd]{background-color:#fff;color:#1f90e6;border-top-left-radius:%?8?%;border-bottom-left-radius:%?8?%;border-color:#fff;border-style:solid;border-width:%?2?%\n}\n.left-unselected[data-v-4bf3a4bd]{background-color:#1f90e6;color:#fff;border-top-left-radius:%?8?%;border-bottom-left-radius:%?8?%;border-color:#fff;border-style:solid;border-width:%?2?%\n}\n.right-selected[data-v-4bf3a4bd]{background-color:#fff;color:#1f90e6;border-top-right-radius:%?8?%;border-bottom-right-radius:%?8?%;border-color:#fff;border-style:solid;border-width:%?2?%\n}\n.right-unselected[data-v-4bf3a4bd]{background-color:#1f90e6;color:#fff;border-top-right-radius:%?8?%;border-bottom-right-radius:%?8?%;border-color:#fff;border-style:solid;border-width:%?2?%\n}\n.page-section[data-v-4bf3a4bd]{margin-bottom:%?0?%\n}\n.page-body[data-v-4bf3a4bd]{padding-bottom:%?40?%\n}\n.hightline[data-v-4bf3a4bd]{color:#1f90e6\n}",""])},"59cc":function(e,t,i){"use strict";i.r(t);var a=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",{staticClass:"container"},[i("v-uni-view",{staticClass:"page-body"},[i("v-uni-view",{staticClass:"page-section",staticStyle:{"background-color":"#1F90E6",width:"100%",flex:"1","padding-top":"2upx","justify-content":"center"}},[i("v-uni-radio-group",{staticClass:"radio-group",staticStyle:{padding:"30upx 0 30upx 0","justify-content":"center",display:"flex"},on:{change:function(t){t=e.$handleEvent(t),e.radioChange(t)}}},e._l(e.items,function(t,a){return i("v-uni-label",{key:a,staticClass:"radio radio-label",class:e.selected==t.value?0==a?"left-selected":"right-selected":0==a?"left-unselected":"right-unselected"},[i("v-uni-radio",{staticStyle:{display:"none"},attrs:{value:t.value,checked:t.checked}}),e._v(e._s(t.name)+"\n\t\t\t\t")],1)})),i("v-uni-view",{staticClass:"uni-row",staticStyle:{display:"flex"}},[i("v-uni-view",{staticClass:"uni-column",staticStyle:{flex:"1","padding-left":"30upx"}},[i("v-uni-text",{staticStyle:{color:"#FFFFFF","font-size":"40upx",width:"100%",display:"block"}},[e._v(e._s(e.original.afterTaxIncomeTitle)+"(元)")]),i("v-uni-text",{staticStyle:{color:"#FFFFFF","font-size":"40upx",width:"100%",display:"block"}},[e._v(e._s(e.original.forward?e.taxResult.afterTaxIncome:e.taxResult.beforeTaxIncome))])],1),i("v-uni-view",{staticStyle:{flex:"1","flex-direction":"column"}},[i("v-uni-text",{staticStyle:{color:"#FFFFFF","font-size":"40upx",width:"100%",display:"block"}},[e._v("纳税金额(元)")]),i("v-uni-text",{staticStyle:{color:"#FFFFFF","font-size":"40upx",width:"100%",display:"block"}},[e._v(e._s(e.taxResult.tax))])],1)],1),i("v-uni-view",{staticClass:"uni-row",staticStyle:{"margin-top":"20upx","margin-bottom":"20upx",display:"flex"}},[i("v-uni-view",{staticStyle:{flex:"1","flex-direction":"column","padding-left":"30upx"}},[i("v-uni-text",{staticStyle:{color:"#FFFFFF","font-size":"35upx",display:"block"}},[e._v("应税金额(元)")]),i("v-uni-text",{staticStyle:{color:"#FFFFFF","font-size":"35upx",display:"block"}},[e._v(e._s(e.taxResult.taxableIncome))])],1),i("v-uni-view",{staticStyle:{flex:"1","flex-direction":"column"}},[i("v-uni-text",{staticStyle:{color:"#FFFFFF","font-size":"35upx",display:"block"}},[e._v("税率(%)")]),i("v-uni-text",{staticStyle:{color:"#FFFFFF","font-size":"35upx",display:"block"}},[e._v(e._s(e.taxResult.taxRate))])],1)],1)],1),i("v-uni-view",{staticClass:"page-section"},[i("v-uni-view",{class:["page-section-title","page-section_center",e.gotoDetail?"hightline":""],on:{click:function(t){t=e.$handleEvent(t),e.openDetail()}}},[e._v("\n\t\t\t\t纳税详情\n\t\t\t")]),i("v-uni-view",{staticClass:"uni-list"},[i("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[i("v-uni-view",[e._v(e._s(e.original.beforeTaxIncomeTitle))]),i("v-uni-view",[i("v-uni-input",{staticClass:"uni-input",attrs:{type:"number",maxlength:"12",placeholder:"请输入"+e.original.beforeTaxIncomeTitle},on:{input:function(t){t=e.$handleEvent(t),e.bindKeyInput(t)}},model:{value:e.original.beforeTaxIncome,callback:function(t){e.$set(e.original,"beforeTaxIncome",t)},expression:"original.beforeTaxIncome"}})],1)],1),i("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[i("v-uni-view",[e._v("财产原值")]),i("v-uni-view",[i("v-uni-input",{staticClass:"uni-input",attrs:{type:"number",maxlength:"12",placeholder:"请输入财产原值"},on:{input:function(t){t=e.$handleEvent(t),e.bindKeyInput(t)}},model:{value:e.original.propertyOriginalIncome,callback:function(t){e.$set(e.original,"propertyOriginalIncome",t)},expression:"original.propertyOriginalIncome"}})],1)],1),i("v-uni-label",{staticClass:"uni-list-cell uni-list-cell-pd"},[i("v-uni-view",[e._v("合理费用")]),i("v-uni-view",[i("v-uni-input",{staticClass:"uni-input",attrs:{type:"number",maxlength:"12",placeholder:"请输入合理费用"},on:{input:function(t){t=e.$handleEvent(t),e.bindKeyInput(t)}},model:{value:e.original.reasonableFee,callback:function(t){e.$set(e.original,"reasonableFee",t)},expression:"original.reasonableFee"}})],1)],1)],1)],1)],1)],1)},o=[],n=i("c284"),l=(i("31cc"),/^-?(\d+(\.\d*)?|\.\d+)(e[+-]?\d+)?$/i),r={data:function(){return{selected:"forward",gotoDetail:!1,original:{forward:!0,beforeTaxIncome:"",beforeTaxIncomeTitle:"转让收入",afterTaxIncomeTitle:"税后收入",propertyOriginalIncome:"",reasonableFee:""},taxResult:{tax:"0.00",afterTaxIncome:"0.00",taxRate:"",taxableIncome:"0.00",beforeTaxIncome:"0.00",riskFund:"0.00"},items:[{name:"正算税后",checked:"true",value:"forward"},{name:"反推税前",value:"reverse"}]}},methods:{radioChange:function(e){this.selected=e.detail.value,"forward"===this.selected?(this.original.beforeTaxIncomeTitle="转让收入",this.original.afterTaxIncomeTitle="税后收入",this.original.forward=!0):(this.original.beforeTaxIncomeTitle="税后收入",this.original.afterTaxIncomeTitle="转让收入",this.original.forward=!1),this.calculator()},openDetail:function(){this.gotoDetail&&uni.navigateTo({url:"/pages/personal-income-tax/propertytransfer/propertytransferDetail?original="+JSON.stringify(this.original)})},bindKeyInput:function(e){this.calculator()},calculator:function(){var e=this.original.beforeTaxIncome;if(!l.test(this.original.beforeTaxIncome))return this.taxResult={afterTaxIncome:"0.00",taxRate:"",taxableIncome:"0.00",tax:"0.00",beforeIncome:"0.00",delta:"0",propertyOriginalIncome:"0.00",reasonableFee:"0.00"},void(this.gotoDetail=!1);this.gotoDetail=!0;var t=this.original.propertyOriginalIncome;l.test(t)||(t="0");var i=this.original.reasonableFee;l.test(i)||(i="0"),"forward"===this.selected?this.taxResult=n["taxCalculator"].propertyTransferTaxForward(e,t,i):this.taxResult=n["taxCalculator"].propertyTransferTaxReverse(e,t,i)}}},s=r,c=(i("ab9a"),i("2877")),u=Object(c["a"])(s,a,o,!1,null,"4bf3a4bd",null);u.options.__file="propertytransfer.vue";t["default"]=u.exports},a8e8:function(e,t,i){var a=i("2880");"string"===typeof a&&(a=[[e.i,a,""]]),a.locals&&(e.exports=a.locals);var o=i("4f06").default;o("b04d8b76",a,!0,{sourceMap:!1,shadowMode:!1})},ab9a:function(e,t,i){"use strict";var a=i("a8e8"),o=i.n(a);o.a}}]);