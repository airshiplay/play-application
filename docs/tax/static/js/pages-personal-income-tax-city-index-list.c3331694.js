(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-personal-income-tax-city-index-list"],{"044e":function(t,e,a){var i=a("1384");"string"===typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);var o=a("4f06").default;o("306afad8",i,!0,{sourceMap:!1,shadowMode:!1})},1384:function(t,e,a){e=t.exports=a("2350")(!1),e.push([t.i,"\n.page[data-v-aa4b52dc]{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-webkit-flex-direction:row;-ms-flex-direction:row;flex-direction:row\n}\n.scrollList[data-v-aa4b52dc]{-webkit-box-flex:1;-webkit-flex:1;-ms-flex:1;flex:1;height:100vh\n}\n.uni-indexed-list-bar[data-v-aa4b52dc]{width:%?46?%;height:100vh;background-color:#d3d3d3;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;-ms-flex-direction:column;flex-direction:column\n}\n.uni-indexed-list-bar.active[data-v-aa4b52dc]{background-color:#c8c8c8\n}\n.uni-indexed-list-text[data-v-aa4b52dc]{color:#aaa;font-size:%?22?%;text-align:center\n}\n.uni-indexed-list-bar.active .uni-indexed-list-text[data-v-aa4b52dc]{color:#333\n}\n.uni-indexed-list-bar.active .uni-indexed-list-text.active[data-v-aa4b52dc],.uni-indexed-list-text.active[data-v-aa4b52dc]{color:#007aff\n}\n.uni-indexed-list-alert[data-v-aa4b52dc]{position:absolute;z-index:20;width:%?160?%;height:%?160?%;left:50%;top:50%;margin-left:%?-80?%;margin-top:%?-80?%;border-radius:%?80?%;text-align:center;line-height:%?160?%;font-size:%?70?%;color:#fff;background-color:rgba(0,0,0,.5)\n}\n.tag-view[data-v-aa4b52dc]{margin:%?10?% %?20?% %?10?% %?20?%;display:inline-block\n}\n.page-section[data-v-aa4b52dc]{margin-bottom:%?0?%\n}",""])},2237:function(t,e,a){(function(t){function e(t){return e="function"===typeof Symbol&&"symbol"===typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&"function"===typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?"symbol":typeof t},e(t)}!function(a,i){"object"===e(t)&&t.exports?t.exports=i():a.onfire=i()}("undefined"!==typeof window?window:this,function(){var t={},a=0,i="string",o="function",n=Function.call.bind(Object.hasOwnProperty),s=Function.call.bind(Array.prototype.slice);function r(s,r,l,c){if(e(s)!==i||e(r)!==o)throw new Error("args: "+i+", "+o);return n(t,s)||(t[s]={}),t[s][++a]=[r,l,c],[s,a]}function l(t,e){for(var a in t)n(t,a)&&e(a,t[a])}function c(t,e,a){return r(t,e,0,a)}function d(t,e,a){return r(t,e,1,a)}function u(e,a){n(t,e)&&l(t[e],function(i,o){o[0].apply(o[2],a),o[1]&&delete t[e][i]})}function f(t){var e=s(arguments,1);setTimeout(function(){u(t,e)})}function p(t){u(t,s(arguments,1))}function g(a){var s,r,c=!1,d=e(a);return d===i?!!n(t,a)&&(delete t[a],!0):"object"===d?(s=a[0],r=a[1],!(!n(t,s)||!n(t[s],r))&&(delete t[s][r],!0)):d!==o||(l(t,function(e,i){l(i,function(i,o){o[0]===a&&(delete t[e][i],c=!0)})}),c)}function v(){t={}}return{on:c,one:d,un:g,fire:f,fireSync:p,clear:v}})}).call(this,a("62e4")(t))},"2e27":function(t,e){function a(t){this.key=t.key,this.requestConfig={key:t.key,s:"rsx",platform:"WXJS",appname:t.key,sdkversion:"1.2.0",logversion:"2.0"}}a.prototype.getWxLocation=function(t,e){wx.getLocation({type:"gcj02",success:function(t){var a=t.longitude+","+t.latitude;wx.setStorage({key:"userLocation",data:a}),e(a)},fail:function(a){wx.getStorage({key:"userLocation",success:function(t){t.data&&e(t.data)}}),t.fail({errCode:"0",errMsg:a.errMsg||""})}})},a.prototype.getRegeo=function(t){function e(e){var i=a.requestConfig;wx.request({url:"https://restapi.amap.com/v3/geocode/regeo",data:{key:a.key,location:e,extensions:"all",s:i.s,platform:i.platform,appname:a.key,sdkversion:i.sdkversion,logversion:i.logversion},method:"GET",header:{"content-type":"application/json"},success:function(a){var i,o,n,s,r,l,c,d,u;a.data.status&&"1"==a.data.status?(i=a.data.regeocode,o=i.addressComponent,n=[],s="",i&&i.roads[0]&&i.roads[0].name&&(s=i.roads[0].name+"附近"),r=e.split(",")[0],l=e.split(",")[1],i.pois&&i.pois[0]&&(s=i.pois[0].name+"附近",c=i.pois[0].location,c&&(r=parseFloat(c.split(",")[0]),l=parseFloat(c.split(",")[1]))),o.provice&&n.push(o.provice),o.city&&n.push(o.city),o.district&&n.push(o.district),o.streetNumber&&o.streetNumber.street&&o.streetNumber.number?(n.push(o.streetNumber.street),n.push(o.streetNumber.number)):(d="",i&&i.roads[0]&&i.roads[0].name&&(d=i.roads[0].name),n.push(d)),n=n.join(""),u=[{iconPath:t.iconPath,width:t.iconWidth,height:t.iconHeight,name:n,desc:s,longitude:r,latitude:l,id:0,regeocodeData:i}],t.success(u)):t.fail({errCode:a.data.infocode,errMsg:a.data.info})},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})}var a=this;t.location?e(t.location):a.getWxLocation(t,function(t){e(t)})},a.prototype.getWeather=function(t){function e(e){var a="base";t.type&&"forecast"==t.type&&(a="all"),wx.request({url:"https://restapi.amap.com/v3/weather/weatherInfo",data:{key:i.key,city:e,extensions:a,s:o.s,platform:o.platform,appname:i.key,sdkversion:o.sdkversion,logversion:o.logversion},method:"GET",header:{"content-type":"application/json"},success:function(e){function a(t){var e={city:{text:"城市",data:t.city},weather:{text:"天气",data:t.weather},temperature:{text:"温度",data:t.temperature},winddirection:{text:"风向",data:t.winddirection+"风"},windpower:{text:"风力",data:t.windpower+"级"},humidity:{text:"湿度",data:t.humidity+"%"}};return e}var i,o;e.data.status&&"1"==e.data.status?e.data.lives?(i=e.data.lives,i&&i.length>0&&(i=i[0],o=a(i),o["liveData"]=i,t.success(o))):e.data.forecasts&&e.data.forecasts[0]&&t.success({forecast:e.data.forecasts[0]}):t.fail({errCode:e.data.infocode,errMsg:e.data.info})},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})}function a(a){wx.request({url:"https://restapi.amap.com/v3/geocode/regeo",data:{key:i.key,location:a,extensions:"all",s:o.s,platform:o.platform,appname:i.key,sdkversion:o.sdkversion,logversion:o.logversion},method:"GET",header:{"content-type":"application/json"},success:function(a){var i,o;a.data.status&&"1"==a.data.status?(o=a.data.regeocode,o.addressComponent?i=o.addressComponent.adcode:o.aois&&o.aois.length>0&&(i=o.aois[0].adcode),e(i)):t.fail({errCode:a.data.infocode,errMsg:a.data.info})},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})}var i=this,o=i.requestConfig;t.city?e(t.city):i.getWxLocation(t,function(t){a(t)})},a.prototype.getPoiAround=function(t){function e(e){var o={key:a.key,location:e,s:i.s,platform:i.platform,appname:a.key,sdkversion:i.sdkversion,logversion:i.logversion};t.querytypes&&(o["types"]=t.querytypes),t.querykeywords&&(o["keywords"]=t.querykeywords),wx.request({url:"https://restapi.amap.com/v3/place/around",data:o,method:"GET",header:{"content-type":"application/json"},success:function(e){var a,i,o,n;if(e.data.status&&"1"==e.data.status){if(e=e.data,e&&e.pois){for(a=[],i=0;i<e.pois.length;i++)o=0==i?t.iconPathSelected:t.iconPath,a.push({latitude:parseFloat(e.pois[i].location.split(",")[1]),longitude:parseFloat(e.pois[i].location.split(",")[0]),iconPath:o,width:22,height:32,id:i,name:e.pois[i].name,address:e.pois[i].address});n={markers:a,poisData:e.pois},t.success(n)}}else t.fail({errCode:e.data.infocode,errMsg:e.data.info})},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})}var a=this,i=a.requestConfig;t.location?e(t.location):a.getWxLocation(t,function(t){e(t)})},a.prototype.getStaticmap=function(t){function e(e){o.push("location="+e),t.zoom&&o.push("zoom="+t.zoom),t.size&&o.push("size="+t.size),t.scale&&o.push("scale="+t.scale),t.markers&&o.push("markers="+t.markers),t.labels&&o.push("labels="+t.labels),t.paths&&o.push("paths="+t.paths),t.traffic&&o.push("traffic="+t.traffic);var a=n+o.join("&");t.success({url:a})}var a,i=this,o=[],n="https://restapi.amap.com/v3/staticmap?";o.push("key="+i.key),a=i.requestConfig,o.push("s="+a.s),o.push("platform="+a.platform),o.push("appname="+a.appname),o.push("sdkversion="+a.sdkversion),o.push("logversion="+a.logversion),t.location?e(t.location):i.getWxLocation(t,function(t){e(t)})},a.prototype.getInputtips=function(t){var e=this,a=e.requestConfig,i={key:e.key,s:a.s,platform:a.platform,appname:e.key,sdkversion:a.sdkversion,logversion:a.logversion};t.location&&(i["location"]=t.location),t.keywords&&(i["keywords"]=t.keywords),t.type&&(i["type"]=t.type),t.city&&(i["city"]=t.city),t.citylimit&&(i["citylimit"]=t.citylimit),wx.request({url:"https://restapi.amap.com/v3/assistant/inputtips",data:i,method:"GET",header:{"content-type":"application/json"},success:function(e){e&&e.data&&e.data.tips&&t.success({tips:e.data.tips})},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})},a.prototype.getDrivingRoute=function(t){var e=this,a=e.requestConfig,i={key:e.key,s:a.s,platform:a.platform,appname:e.key,sdkversion:a.sdkversion,logversion:a.logversion};t.origin&&(i["origin"]=t.origin),t.destination&&(i["destination"]=t.destination),t.strategy&&(i["strategy"]=t.strategy),t.waypoints&&(i["waypoints"]=t.waypoints),t.avoidpolygons&&(i["avoidpolygons"]=t.avoidpolygons),t.avoidroad&&(i["avoidroad"]=t.avoidroad),wx.request({url:"https://restapi.amap.com/v3/direction/driving",data:i,method:"GET",header:{"content-type":"application/json"},success:function(e){e&&e.data&&e.data.route&&t.success({paths:e.data.route.paths,taxi_cost:e.data.route.taxi_cost||""})},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})},a.prototype.getWalkingRoute=function(t){var e=this,a=e.requestConfig,i={key:e.key,s:a.s,platform:a.platform,appname:e.key,sdkversion:a.sdkversion,logversion:a.logversion};t.origin&&(i["origin"]=t.origin),t.destination&&(i["destination"]=t.destination),wx.request({url:"https://restapi.amap.com/v3/direction/walking",data:i,method:"GET",header:{"content-type":"application/json"},success:function(e){e&&e.data&&e.data.route&&t.success({paths:e.data.route.paths})},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})},a.prototype.getTransitRoute=function(t){var e=this,a=e.requestConfig,i={key:e.key,s:a.s,platform:a.platform,appname:e.key,sdkversion:a.sdkversion,logversion:a.logversion};t.origin&&(i["origin"]=t.origin),t.destination&&(i["destination"]=t.destination),t.strategy&&(i["strategy"]=t.strategy),t.city&&(i["city"]=t.city),t.cityd&&(i["cityd"]=t.cityd),wx.request({url:"https://restapi.amap.com/v3/direction/transit/integrated",data:i,method:"GET",header:{"content-type":"application/json"},success:function(e){if(e&&e.data&&e.data.route){var a=e.data.route;t.success({distance:a.distance||"",taxi_cost:a.taxi_cost||"",transits:a.transits})}},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})},a.prototype.getRidingRoute=function(t){var e=this,a=e.requestConfig,i={key:e.key,s:a.s,platform:a.platform,appname:e.key,sdkversion:a.sdkversion,logversion:a.logversion};t.origin&&(i["origin"]=t.origin),t.destination&&(i["destination"]=t.destination),wx.request({url:"https://restapi.amap.com/v4/direction/bicycling",data:i,method:"GET",header:{"content-type":"application/json"},success:function(e){e&&e.data&&e.data.data&&t.success({paths:e.data.data.paths})},fail:function(e){t.fail({errCode:"0",errMsg:e.errMsg||""})}})},t.exports.AMapWX=a},5114:function(t,e,a){e=t.exports=a("2350")(!1),e.push([t.i,"\n.uni-tag[data-v-a54f8db8],.uni-tag-default[data-v-a54f8db8]{-webkit-box-sizing:border-box;box-sizing:border-box;padding:0 %?32?%;height:%?60?%;line-height:calc(%?60?% - 2px);font-size:%?28?%;display:inline-block;color:#666;border-radius:%?8?%;background-color:#f1f1f1;border:1px solid #f1f1f1\n}\n.uni-tag-circle[data-v-a54f8db8]{border-radius:%?30?%\n}\n.uni-tag-small[data-v-a54f8db8]{height:%?40?%;padding:0 %?16?%;line-height:calc(%?40?% - 2px);font-size:%?20?%\n}\n.uni-tag-disabled[data-v-a54f8db8]{opacity:.5\n}\n.uni-tag.uni-tag-inverted[data-v-a54f8db8]{color:#666;background-color:#fff;border:1px solid # F1F1F1\n}\n.uni-tag-primary[data-v-a54f8db8]{color:#fff;background-color:#007aff;border:1px solid #007aff\n}\n.uni-tag-primary.uni-tag-inverted[data-v-a54f8db8]{color:#007aff;background-color:#fff;border:1px solid #007aff\n}\n.uni-tag-success[data-v-a54f8db8]{color:#fff;background-color:#4cd964;border:1px solid #4cd964\n}\n.uni-tag-success.uni-tag-inverted[data-v-a54f8db8]{color:#4cd964;background-color:#fff;border:1px solid #4cd964\n}\n.uni-tag-warning[data-v-a54f8db8]{color:#fff;background-color:#f0ad4e;border:1px solid #f0ad4e\n}\n.uni-tag-warning.uni-tag-inverted[data-v-a54f8db8]{color:#f0ad4e;background-color:#fff;border:1px solid #f0ad4e\n}\n.uni-tag-danger[data-v-a54f8db8]{color:#fff;background-color:#dd524d;border:1px solid #dd524d\n}\n.uni-tag-danger.uni-tag-inverted[data-v-a54f8db8]{color:#dd524d;background-color:#fff;border:1px solid #dd524d\n}\n.uni-tag-royal[data-v-a54f8db8]{color:#fff;background-color:#8a6de9;border:1px solid #8a6de9\n}\n.uni-tag-royal.uni-tag-inverted[data-v-a54f8db8]{color:#8a6de9;background-color:#fff;border:1px solid #8a6de9\n}",""])},5590:function(t,e){t.exports={hotCityList:[{value:"110000",label:"北京市"},{label:"上海市"},{label:"广州市"},{label:"深圳市"},{label:"天津市"},{label:"西安市"},{label:"重庆市"},{label:"杭州市"},{label:"南京市"}],list:[{letter:"A",data:[{value:"340800",label:"安庆市"}]},{letter:"B",data:[{value:"110000",label:"北京市"},{label:"保定市"}]},{letter:"C",data:[{label:"重庆市"},{label:"成都市"},{label:"长沙市"},{label:"常州市"},{label:"长春市"}]},{letter:"D",data:[{label:"大连市"}]},{letter:"E",data:[]},{letter:"F",data:[]},{letter:"G",data:[]},{letter:"H",data:[]},{letter:"I",data:[]},{letter:"J",data:[]},{letter:"K",data:[]},{letter:"L",data:[]},{letter:"M",data:[]},{letter:"N",data:[]},{letter:"O",data:[]},{letter:"P",data:[]},{letter:"Q",data:[]},{letter:"R",data:[]},{letter:"S",data:[]},{letter:"T",data:[]},{letter:"U",data:[]},{letter:"V",data:[]},{letter:"W",data:[]},{letter:"X",data:[]},{letter:"Y",data:[]},{letter:"Z",data:[]}]}},"62e4":function(t,e){t.exports=function(t){return t.webpackPolyfill||(t.deprecate=function(){},t.paths=[],t.children||(t.children=[]),Object.defineProperty(t,"loaded",{enumerable:!0,get:function(){return t.l}}),Object.defineProperty(t,"id",{enumerable:!0,get:function(){return t.i}}),t.webpackPolyfill=1),t}},6306:function(t,e,a){"use strict";a.r(e);var i=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("v-uni-view",{staticClass:"page"},[a("v-uni-scroll-view",{staticClass:"scrollList",style:{height:t.winHeight+"px;"},attrs:{"scroll-y":"","scroll-into-view":t.scrollViewId}},[a("v-uni-view",{staticClass:"page-section"},[a("v-uni-view",{staticClass:"page-section-title"},[t._v("定位/最近访问")]),a("v-uni-view",{staticClass:"page-section",staticStyle:{"align-items":"center","justify-content":"center"}},[a("v-uni-view",{staticClass:"tag-view"},[a("uni-tag",{attrs:{text:t.locationCity.label,inverted:"true",type:"primary"},on:{click:function(e){e=t.$handleEvent(e),t.chooseCity(t.locationCity)}}})],1),t._l(t.latestCityList,function(e,i){return[a("v-uni-view",{key:i+"_0",staticClass:"tag-view"},[a("uni-tag",{attrs:{text:e.label,inverted:"true",type:"primary"},on:{click:function(a){a=t.$handleEvent(a),t.chooseCity(e)}}})],1)]})],2)],1),a("v-uni-view",{staticClass:"page-section"},[a("v-uni-view",{staticClass:"page-section-title"},[t._v("热门城市")]),a("v-uni-view",{staticClass:"page-section",staticStyle:{"align-items":"center","justify-content":"center"}},[t._l(t.hotCityList,function(e,i){return[a("v-uni-view",{key:i+"_0",staticClass:"tag-view"},[a("uni-tag",{attrs:{text:e.label,inverted:"true",type:"primary"},on:{click:function(a){a=t.$handleEvent(a),t.chooseCity(e)}}})],1)]})],2)],1),a("v-uni-view",{staticClass:"uni-list"},[t._l(t.lists,function(e,i){return e.data[0]?[a("v-uni-view",{key:i+"_0",staticClass:"uni-list-cell-divider",attrs:{id:e.letter}},[t._v("\n\t\t\t\t\t"+t._s(e.letter)+"\n\t\t\t\t")]),t._l(e.data,function(o,n){return a("v-uni-view",{key:n+"_"+i+"_1",staticClass:"uni-list-cell",class:e.data.length-1==n?"uni-list-cell-last":"",attrs:{"hover-class":"uni-list-cell-hover"},on:{click:function(e){e=t.$handleEvent(e),t.chooseCity(o)}}},[a("v-uni-view",{staticClass:"uni-list-cell-navigate"},[t._v("\n\t\t\t\t\t\t"+t._s(o.label)+"\n\t\t\t\t\t")])],1)})]:t._e()})],2)],1),a("v-uni-view",{staticClass:"uni-indexed-list-bar",class:t.touchmove?"active":"",style:{height:t.winHeight+"px;"},on:{touchstart:function(e){e=t.$handleEvent(e),t.touchStart(e)},touchmove:function(e){e=t.$handleEvent(e),t.touchMove(e)},touchend:function(e){e=t.$handleEvent(e),t.touchEnd(e)},touchcancel:function(e){e=t.$handleEvent(e),t.touchCancel(e)}}},t._l(t.lists,function(e,i){return a("v-uni-text",{key:i,staticClass:"uni-indexed-list-text",class:t.touchmoveIndex==i?"active":"",style:{heigth:t.itemHeight+"px",lineHeight:t.itemHeight+"px"}},[t._v(t._s(e.letter))])})),t.touchmove?a("v-uni-view",{staticClass:"uni-indexed-list-alert"},[t._v("\n\t\t"+t._s(t.lists[t.touchmoveIndex].letter)+"\n\t")]):t._e()],1)},o=[],n=a("2237"),s=a.n(n),r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return t.text?a("v-uni-view",{staticClass:"uni-tag",class:[!0===t.disabled||"true"===t.disabled?"uni-tag-disabled":"",!0===t.inverted||"true"===t.inverted?"uni-tag-inverted":"",!0===t.circle||"true"===t.circle?"uni-tag-circle":"","uni-tag-"+t.size,"uni-tag-"+t.type],on:{click:function(e){e=t.$handleEvent(e),t.onClick()}}},[t._v(t._s(t.text))]):t._e()},l=[],c={props:{type:{type:String,default:"default"},size:{type:String,default:"normal"},text:String,disabled:{type:[String,Boolean],defalut:!1},inverted:{type:[String,Boolean],defalut:!1},circle:{type:[String,Boolean],defalut:!1}},methods:{onClick:function(){!0!==this.disabled&&"true"!==this.disabled&&this.$emit("click")}}},d=c,u=(a("c037"),a("2877")),f=Object(u["a"])(d,r,l,!1,null,"a54f8db8",null);f.options.__file="uni-tag.vue";var p=f.exports,g=a("2e27"),v=a.n(g),h=(a("5590"),"http://www.airlenet.com/mobile/api/city.json"),y={components:{uniTag:p},data:function(){return{title:"grid",lists:[],key:"8b51cc54f24857a8f3102ee0c0cf6e60",locationCity:{},latestCityList:[],hotCityList:[],touchmove:!1,touchmoveIndex:-1,itemHeight:0,winHeight:0,scrollViewId:""}},onLoad:function(){e=this;var t=uni.getSystemInfoSync().windowHeight;this.itemHeight=t/26,this.winHeight=t,uni.getStorage({key:"latestCityList",success:function(t){if(console.log(t.data),t.data){for(var a=JSON.parse(t.data),i=0;i<a.length;i++){var o=a[i];o&&o.label==e.locationCity.label&&a.splice(i,1)}e.latestCityList=a}}}),this.loadData(),this.amapPlugin=new v.a.AMapWX({key:this.key});var e=this;this.amapPlugin.getRegeo({success:function(t){var a=t[0].regeocodeData.addressComponent,i=a.city;i&&(e.locationCity={label:i,value:a.adcode})},fail:function(t){}})},methods:{touchStart:function(t){this.touchmove=!0;var e=t.touches[0].pageY,a=Math.floor(e/this.itemHeight);this.scrollViewId=this.lists[a].letter,this.touchmoveIndex=a},touchMove:function(t){var e=t.touches[0].pageY,a=Math.floor(e/this.itemHeight);this.scrollViewId=this.lists[a].letter,this.touchmoveIndex=a},touchEnd:function(){this.touchmove=!1,this.touchmoveIndex=-1},touchCancel:function(){this.touchmove=!1,this.touchmoveIndex=-1},chooseCity:function(t){for(var e=this,a=t,i=this.latestCityList,o=0;o<i.length;o++){var n=i[o];n.label==a.label&&i.splice(o,1)}a.label!=e.locationCity.label&&(i=[a].concat(i),i.length>10&&(i=i.slice(0,10)),uni.setStorageSync("latestCityList",JSON.stringify(i))),s.a.fire("setCity",a),uni.navigateBack()},loadData:function(){var t=this;uni.showNavigationBarLoading(),uni.request({url:h,data:{noncestr:Date.now()},success:function(e){if(200==e.statusCode){var a=e.data;t.lists=a.list,t.hotCityList=a.hotCityList}},fail:function(t){uni.showModal({content:t.errMsg,showCancel:!1})},complete:function(){t.loading=!1,uni.hideNavigationBarLoading()}})}}},b=y,m=(a("6a73"),Object(u["a"])(b,i,o,!1,null,"aa4b52dc",null));m.options.__file="index-list.vue";e["default"]=m.exports},"6a73":function(t,e,a){"use strict";var i=a("044e"),o=a.n(i);o.a},c037:function(t,e,a){"use strict";var i=a("d6bb"),o=a.n(i);o.a},d6bb:function(t,e,a){var i=a("5114");"string"===typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);var o=a("4f06").default;o("6982e64b",i,!0,{sourceMap:!1,shadowMode:!1})}}]);