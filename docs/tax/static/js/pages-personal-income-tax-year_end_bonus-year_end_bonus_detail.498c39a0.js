(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-personal-income-tax-year_end_bonus-year_end_bonus_detail"],{"03fc":function(t,i,e){var a=e("99c0");"string"===typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);var n=e("4f06").default;n("5b2954bb",a,!0,{sourceMap:!1,shadowMode:!1})},"99c0":function(t,i,e){i=t.exports=e("2350")(!1),i.push([t.i,'\n.page-section>.uni-list[data-v-5d16ad64]:before{position:absolute;z-index:10;right:0;bottom:%?0?%;left:0;height:%?0?%;content:"";background:rgba(0,0,0,0)\n}\n.page-section>.uni-list[data-v-5d16ad64]:after{position:absolute;z-index:10;right:0;bottom:%?-30?%;left:0;height:%?50?%;content:"";border-bottom-left-radius:%?30?%;border-bottom-right-radius:%?30?%;background:#f1f1f1\n}\n.page-section-gap .uni-list-cell-navigate[data-v-5d16ad64]{padding:%?10?% %?5?% %?10?% %?5?%!important\n}\n.uni-list>.uni-list-cell[data-v-5d16ad64]:nth-child(odd){background-color:#f5f5f5\n}\n.uni-list>.uni-list-cell[data-v-5d16ad64]:nth-child(2n){background-color:#fff\n}',""])},e5f0:function(t,i,e){"use strict";var a=e("03fc"),n=e.n(a);n.a},f2f8:function(t,i,e){"use strict";e.r(i);var a=function(){var t=this,i=t.$createElement,e=t._self._c||i;return e("v-uni-view",{style:"height:"+t.windowHeight+"px",attrs:{"scroll-y":"true"}},[e("v-uni-view",{staticClass:"page-body"},[e("v-uni-view",{staticClass:"page-section",staticStyle:{padding:"20upx","flex-wrap":"wrap",display:"initial"}},[e("v-uni-view",{staticClass:"uni-list",staticStyle:{margin:"20upx",flex:"100%",width:"auto",display:"flex","background-color":"#00000000"}},[e("v-uni-view",{staticStyle:{background:"#1F90E6",padding:"20upx","border-top-left-radius":"30upx","border-top-right-radius":"30upx",color:"#FFFFFF","font-size":"40upx"}},[t._v("纳税金额(元)")]),e("v-uni-view",{staticStyle:{background:"#1F90E6",padding:"0upx 20upx 20upx 20upx",color:"#FFFFFF","font-size":"36upx"}},[t._v(t._s(t.taxResult.tax))]),t._l(t.list,function(i,a){return e("v-uni-view",{key:a,staticClass:"uni-list-cell",staticStyle:{background:"#F1F1F1"}},[e("v-uni-view",{staticClass:"uni-list-cell-navigate"},[t._v("\n\t\t\t\t\t\t"+t._s(i.title)+"\n\t\t\t\t\t")]),e("v-uni-view",{staticClass:"uni-list-cell-navigate",staticStyle:{"align-items":"flex-end","justify-content":"flex-end"}},[t._v("\n\t\t\t\t\t\t"+t._s(i.value)+"\n\t\t\t\t\t")])],1)})],2)],1),e("v-uni-view",{staticClass:"page-section"},[e("v-uni-view",{staticClass:"page-section-title"},[t._v("\n\t\t\t\t个税类型介绍\n\t\t\t")]),e("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t工资、薪金所得，是指个人因任职或受雇而取得的工资、薪金、奖金、年终加薪、劳动分红、津贴、补贴以及与任职或受雇有关的其他所得。\n\t\t\t")])],1),e("v-uni-view",{staticClass:"page-section"},[e("v-uni-view",{staticClass:"page-section-title"},[t._v("\n\t\t\t\t工资收入所得税计算公式\n\t\t\t")]),e("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t应纳税收入额 = 年终奖金\n\t\t\t")]),e("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t应纳税额 = （应纳税收入额÷12 × 适用税率 - 速算扣除数）× 12\n\t\t\t")])],1),e("v-uni-view",{staticClass:"page-section"},[e("v-uni-view",{staticClass:"page-section-title"},[t._v("\n\t\t\t\t2018年最新个人所得税税率表：年终奖收入所得税税率表\n\t\t\t")]),e("v-uni-view",{staticClass:"page-section-gap"},[e("v-uni-view",{staticClass:"uni-list",staticStyle:{"margin-bottom":"20upx"}},t._l(t.taxLevelShowList,function(i,a){return e("v-uni-view",{key:a,staticClass:"uni-list-cell"},[e("v-uni-view",{staticClass:"uni-list-cell-navigate",staticStyle:{flex:"2"}},[t._v("\n\t\t\t\t\t\t\t"+t._s(i.level)+"\n\t\t\t\t\t\t")]),e("v-uni-view",{staticClass:"uni-list-cell-navigate",staticStyle:{"border-color":"#999999",flex:"10"}},[t._v("\n\t\t\t\t\t\t\t"+t._s(i.range)+"\n\t\t\t\t\t\t")]),e("v-uni-view",{staticClass:"uni-list-cell-navigate",staticStyle:{flex:"3"}},[t._v("\n\t\t\t\t\t\t\t"+t._s(i.rate)+"\n\t\t\t\t\t\t")]),e("v-uni-view",{staticClass:"uni-list-cell-navigate",staticStyle:{flex:"4"}},[t._v("\n\t\t\t\t\t\t\t"+t._s(i.delta)+"\n\t\t\t\t\t\t")])],1)}))],1)],1),e("v-uni-view",{staticClass:"page-section"},[e("v-uni-view",{staticClass:"page-section-title page-section_center"},[t._v("----计算结果仅供参考----")])],1)],1)],1)},n=[],s=e("c284"),l=/^-?(\d+(\.\d*)?|\.\d+)(e[+-]?\d+)?$/i,o={data:function(){return{windowHeight:200,original:{forward:!0,beforeTaxIncome:"",riskFund:"0"},taxResult:{tax:"0.00",afterTaxIncome:"0.00",taxRate:"",taxableIncome:"0.00",beforeTaxIncome:"0.00",threshold:"5000",riskFund:"0.00"},list:[],taxLevelShowList:[]}},onLoad:function(t){this.windowHeight=uni.getSystemInfoSync().windowHeight,this.original=JSON.parse(t.original),l.test(this.original.riskFund)||(this.original.riskFund="0"),this.original.forward?this.taxResult=s["taxCalculator"].yearEndBonusTaxForward(this.original.beforeTaxIncome):this.taxResult=s["taxCalculator"].yearEndBonusTaxReverse(this.original.beforeTaxIncome),this.list=[{title:"税前收入(元)",value:this.taxResult.beforeTaxIncome},{title:"税率(%)",value:this.taxResult.taxRate},{title:"速扣数",value:this.taxResult.delta},{title:"税后收入(元)",value:this.taxResult.afterTaxIncome}];var i=s["taxCalculator"].salaryTaxlList().list;this.taxLevelShowList.push({level:"级别",range:"应纳税所得额(含税)",rate:"税率(%)",delta:"速算扣除数"});for(var e=0;e<i.length;e++){var a=i[e];this.taxLevelShowList.push({level:a.level,range:"超过"+a.start+"至"+a.end+"部分",rate:a.rate,delta:a.delta})}}},u=o,c=(e("e5f0"),e("2877")),r=Object(c["a"])(u,a,n,!1,null,"5d16ad64",null);r.options.__file="year_end_bonus_detail.vue";i["default"]=r.exports}}]);