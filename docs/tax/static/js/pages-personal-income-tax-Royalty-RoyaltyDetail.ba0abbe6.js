(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-personal-income-tax-Royalty-RoyaltyDetail"],{1078:function(t,i,a){"use strict";a.r(i);var e=function(){var t=this,i=t.$createElement,a=t._self._c||i;return a("v-uni-view",{style:"height:"+t.windowHeight+"px",attrs:{"scroll-y":"true"}},[a("v-uni-view",{staticClass:"page-body"},[a("v-uni-view",{staticClass:"page-section",staticStyle:{padding:"20upx","flex-wrap":"wrap",display:"initial"}},[a("v-uni-view",{staticClass:"uni-list",staticStyle:{margin:"20upx",flex:"100%",width:"auto",display:"flex","background-color":"#00000000"}},[a("v-uni-view",{staticStyle:{background:"#1F90E6",padding:"20upx","border-top-left-radius":"30upx","border-top-right-radius":"30upx",color:"#FFFFFF","font-size":"40upx"}},[t._v("纳税金额(元)")]),a("v-uni-view",{staticStyle:{background:"#1F90E6",padding:"0upx 20upx 20upx 20upx",color:"#FFFFFF","font-size":"36upx"}},[t._v(t._s(t.taxResult.tax))]),t._l(t.list,function(i,e){return a("v-uni-view",{key:e,staticClass:"uni-list-cell",staticStyle:{background:"#F1F1F1"}},[a("v-uni-view",{staticClass:"uni-list-cell-navigate"},[t._v("\n\t\t\t\t\t\t"+t._s(i.title)+"\n\t\t\t\t\t")]),a("v-uni-view",{staticClass:"uni-list-cell-navigate",staticStyle:{"align-items":"flex-end","justify-content":"flex-end"}},[t._v("\n\t\t\t\t\t\t"+t._s(i.value)+"\n\t\t\t\t\t")])],1)})],2)],1),a("v-uni-view",{staticClass:"page-section"},[a("v-uni-view",{staticClass:"page-section-title"},[t._v("\n\t\t\t\t个税类型介绍\n\t\t\t")]),a("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t特许权使用费所得，是指个人提供专利权、著作权、商标权、非专利技术以及其他特许权的使用权取得的所得。\n\t\t\t")])],1),a("v-uni-view",{staticClass:"page-section"},[a("v-uni-view",{staticClass:"page-section-title"},[t._v("\n\t\t\t\t特许权使用费所得所得税计算公式\n\t\t\t")]),a("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t应纳税所得额 = 特许权使用费（不超过4000元） - 800元\n\t\t\t")]),a("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t应纳税所得额 = 特许权使用费（超过4000元）×（1 - 20%）\n\t\t\t")]),a("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t应纳税额 = 应纳税所得额 × 20%\n\t\t\t")])],1),a("v-uni-view",{staticClass:"page-section"},[a("v-uni-view",{staticClass:"page-section-title"},[t._v("\n\t\t\t\t2018年最新个人所得税税率表：特许权使用费所得所得税税率表\n\t\t\t")]),a("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t特许权使用费所得，适用20%的比例税率。\n\t\t\t")]),a("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t提示：\n\t\t\t")]),a("v-uni-view",{staticClass:"page-section-gap"},[t._v("\n\t\t\t\t特许权使用费所得，以一项特许权的一次许可使用所取得的收入为一次。如果该次转让取得的收入是分笔支付的，则应将各笔收入相加为一次，即合并收入计征个人所得税。\n\t\t\t")])],1),a("v-uni-view",{staticClass:"page-section"},[a("v-uni-view",{staticClass:"page-section-title page-section_center"},[t._v("----计算结果仅供参考----")])],1)],1)],1)},s=[],n=a("c284"),l=/^-?(\d+(\.\d*)?|\.\d+)(e[+-]?\d+)?$/i,o={data:function(){return{windowHeight:200,original:{forward:!0,beforeTaxIncome:"",riskFund:"0"},taxResult:{tax:"0.00",afterTaxIncome:"0.00",taxRate:"",taxableIncome:"0.00",beforeTaxIncome:"0.00",threshold:"5000",riskFund:"0.00"},list:[],taxLevelShowList:[]}},onLoad:function(t){this.windowHeight=uni.getSystemInfoSync().windowHeight,this.original=JSON.parse(t.original),l.test(this.original.riskFund)||(this.original.riskFund="0"),this.original.forward?this.taxResult=n["taxCalculator"].salaryTaxForward(this.original.beforeTaxIncome,this.original.riskFund,0):this.taxResult=n["taxCalculator"].salaryTaxReverse(this.original.beforeTaxIncome,this.original.riskFund,0),this.list=[{title:"税前收入(元)",value:this.taxResult.beforeTaxIncome},{title:"五险一金(元)",value:this.taxResult.riskFund},{title:"起征点(元)",value:this.taxResult.threshold},{title:"应纳税所得额(元)",value:this.taxResult.taxableIncome},{title:"税率(%)",value:this.taxResult.taxRate},{title:"速扣数",value:this.taxResult.delta},{title:"税后收入(元)",value:this.taxResult.afterTaxIncome}];var i=n["taxCalculator"].salaryTaxlList().list;this.taxLevelShowList.push({level:"级别",range:"应纳税所得额(含税)",rate:"税率(%)",delta:"速算扣除数"});for(var a=0;a<i.length;a++){var e=i[a];this.taxLevelShowList.push({level:e.level,range:"超过"+e.start+"至"+e.end+"部分",rate:e.rate,delta:e.delta})}}},c=o,u=(a("c438"),a("2877")),r=Object(u["a"])(c,e,s,!1,null,"0a414b5c",null);r.options.__file="RoyaltyDetail.vue";i["default"]=r.exports},"460b":function(t,i,a){var e=a("907c");"string"===typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);var s=a("4f06").default;s("411aecff",e,!0,{sourceMap:!1,shadowMode:!1})},"907c":function(t,i,a){i=t.exports=a("2350")(!1),i.push([t.i,'\n.page-section>.uni-list[data-v-0a414b5c]:before{position:absolute;z-index:10;right:0;bottom:%?0?%;left:0;height:%?0?%;content:"";background:rgba(0,0,0,0)\n}\n.page-section>.uni-list[data-v-0a414b5c]:after{position:absolute;z-index:10;right:0;bottom:%?-30?%;left:0;height:%?50?%;content:"";border-bottom-left-radius:%?30?%;border-bottom-right-radius:%?30?%;background:#f1f1f1\n}\n.page-section-gap .uni-list-cell-navigate[data-v-0a414b5c]{padding:%?10?% %?5?% %?10?% %?5?%!important\n}\n.uni-list>.uni-list-cell[data-v-0a414b5c]:nth-child(odd){background-color:#f5f5f5\n}\n.uni-list>.uni-list-cell[data-v-0a414b5c]:nth-child(2n){background-color:#fff\n}',""])},c438:function(t,i,a){"use strict";var e=a("460b"),s=a.n(e);s.a}}]);