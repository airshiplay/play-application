(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-personal-income-tax-LaborRemuneration-LaborRemuneration~pages-personal-income-tax-LaborRemuner~50a48a1a"],{"31cc":function(e,t,n){var r;(function(a){"use strict";var i,o=20,l=1,s=1e6,c=1e6,d=-7,m=21,u="[big.js] ",f=u+"Invalid ",w=f+"decimal places",v=f+"rounding mode",S=u+"Division by zero",g={},h=void 0,x=/^-?(\d+(\.\d*)?|\.\d+)(e[+-]?\d+)?$/i;function E(){function e(t){var n=this;if(!(n instanceof e))return t===h?E():new e(t);t instanceof e?(n.s=t.s,n.e=t.e,n.c=t.c.slice()):p(n,t),n.constructor=e}return e.prototype=g,e.DP=o,e.RM=l,e.NE=d,e.PE=m,e.version="5.2.2",e}function p(e,t){var n,r,a;if(0===t&&1/t<0)t="-0";else if(!x.test(t+=""))throw Error(f+"number");for(e.s="-"==t.charAt(0)?(t=t.slice(1),-1):1,(n=t.indexOf("."))>-1&&(t=t.replace(".","")),(r=t.search(/e/i))>0?(n<0&&(n=r),n+=+t.slice(r+1),t=t.substring(0,r)):n<0&&(n=t.length),a=t.length,r=0;r<a&&"0"==t.charAt(r);)++r;if(r==a)e.c=[e.e=0];else{for(;a>0&&"0"==t.charAt(--a););for(e.e=n-r-1,e.c=[],n=0;r<=a;)e.c[n++]=+t.charAt(r++)}return e}function I(e,t,n,r){var a=e.c,i=e.e+t+1;if(i<a.length){if(1===n)r=a[i]>=5;else if(2===n)r=a[i]>5||5==a[i]&&(r||i<0||a[i+1]!==h||1&a[i-1]);else if(3===n)r=r||!!a[0];else if(r=!1,0!==n)throw Error(v);if(i<1)a.length=1,r?(e.e=-t,a[0]=1):a[0]=e.e=0;else{if(a.length=i--,r)for(;++a[i]>9;)a[i]=0,i--||(++e.e,a.unshift(1));for(i=a.length;!a[--i];)a.pop()}}else if(n<0||n>3||n!==~~n)throw Error(v);return e}function b(e,t,n,r){var a,i,o=e.constructor,l=!e.c[0];if(n!==h){if(n!==~~n||n<(3==t)||n>s)throw Error(3==t?f+"precision":w);for(e=new o(e),n=r-e.e,e.c.length>++r&&I(e,n,o.RM),2==t&&(r=e.e+n+1);e.c.length<r;)e.c.push(0)}if(a=e.e,i=e.c.join(""),n=i.length,2!=t&&(1==t||3==t&&r<=a||a<=o.NE||a>=o.PE))i=i.charAt(0)+(n>1?"."+i.slice(1):"")+(a<0?"e":"e+")+a;else if(a<0){for(;++a;)i="0"+i;i="0."+i}else if(a>0)if(++a>n)for(a-=n;a--;)i+="0";else a<n&&(i=i.slice(0,a)+"."+i.slice(a));else n>1&&(i=i.charAt(0)+"."+i.slice(1));return e.s<0&&(!l||4==t)?"-"+i:i}g.abs=function(){var e=new this.constructor(this);return e.s=1,e},g.cmp=function(e){var t,n=this,r=n.c,a=(e=new n.constructor(e)).c,i=n.s,o=e.s,l=n.e,s=e.e;if(!r[0]||!a[0])return r[0]?i:a[0]?-o:0;if(i!=o)return i;if(t=i<0,l!=s)return l>s^t?1:-1;for(o=(l=r.length)<(s=a.length)?l:s,i=-1;++i<o;)if(r[i]!=a[i])return r[i]>a[i]^t?1:-1;return l==s?0:l>s^t?1:-1},g.div=function(e){var t=this,n=t.constructor,r=t.c,a=(e=new n(e)).c,i=t.s==e.s?1:-1,o=n.DP;if(o!==~~o||o<0||o>s)throw Error(w);if(!a[0])throw Error(S);if(!r[0])return new n(0*i);var l,c,d,m,u,f=a.slice(),v=l=a.length,g=r.length,x=r.slice(0,l),E=x.length,p=e,b=p.c=[],R=0,T=o+(p.e=t.e-e.e)+1;for(p.s=i,i=T<0?0:T,f.unshift(0);E++<l;)x.push(0);do{for(d=0;d<10;d++){if(l!=(E=x.length))m=l>E?1:-1;else for(u=-1,m=0;++u<l;)if(a[u]!=x[u]){m=a[u]>x[u]?1:-1;break}if(!(m<0))break;for(c=E==l?a:f;E;){if(x[--E]<c[E]){for(u=E;u&&!x[--u];)x[u]=9;--x[u],x[E]+=10}x[E]-=c[E]}for(;!x[0];)x.shift()}b[R++]=m?d:++d,x[0]&&m?x[E]=r[v]||0:x=[r[v]]}while((v++<g||x[0]!==h)&&i--);return b[0]||1==R||(b.shift(),p.e--),R>T&&I(p,o,n.RM,x[0]!==h),p},g.eq=function(e){return!this.cmp(e)},g.gt=function(e){return this.cmp(e)>0},g.gte=function(e){return this.cmp(e)>-1},g.lt=function(e){return this.cmp(e)<0},g.lte=function(e){return this.cmp(e)<1},g.minus=g.sub=function(e){var t,n,r,a,i=this,o=i.constructor,l=i.s,s=(e=new o(e)).s;if(l!=s)return e.s=-s,i.plus(e);var c=i.c.slice(),d=i.e,m=e.c,u=e.e;if(!c[0]||!m[0])return m[0]?(e.s=-s,e):new o(c[0]?i:0);if(l=d-u){for((a=l<0)?(l=-l,r=c):(u=d,r=m),r.reverse(),s=l;s--;)r.push(0);r.reverse()}else for(n=((a=c.length<m.length)?c:m).length,l=s=0;s<n;s++)if(c[s]!=m[s]){a=c[s]<m[s];break}if(a&&(r=c,c=m,m=r,e.s=-e.s),(s=(n=m.length)-(t=c.length))>0)for(;s--;)c[t++]=0;for(s=t;n>l;){if(c[--n]<m[n]){for(t=n;t&&!c[--t];)c[t]=9;--c[t],c[n]+=10}c[n]-=m[n]}for(;0===c[--s];)c.pop();for(;0===c[0];)c.shift(),--u;return c[0]||(e.s=1,c=[u=0]),e.c=c,e.e=u,e},g.mod=function(e){var t,n=this,r=n.constructor,a=n.s,i=(e=new r(e)).s;if(!e.c[0])throw Error(S);return n.s=e.s=1,t=1==e.cmp(n),n.s=a,e.s=i,t?new r(n):(a=r.DP,i=r.RM,r.DP=r.RM=0,n=n.div(e),r.DP=a,r.RM=i,this.minus(n.times(e)))},g.plus=g.add=function(e){var t,n=this,r=n.constructor,a=n.s,i=(e=new r(e)).s;if(a!=i)return e.s=-i,n.minus(e);var o=n.e,l=n.c,s=e.e,c=e.c;if(!l[0]||!c[0])return c[0]?e:new r(l[0]?n:0*a);if(l=l.slice(),a=o-s){for(a>0?(s=o,t=c):(a=-a,t=l),t.reverse();a--;)t.push(0);t.reverse()}for(l.length-c.length<0&&(t=c,c=l,l=t),a=c.length,i=0;a;l[a]%=10)i=(l[--a]=l[a]+c[a]+i)/10|0;for(i&&(l.unshift(i),++s),a=l.length;0===l[--a];)l.pop();return e.c=l,e.e=s,e},g.pow=function(e){var t=this,n=new t.constructor(1),r=n,a=e<0;if(e!==~~e||e<-c||e>c)throw Error(f+"exponent");for(a&&(e=-e);;){if(1&e&&(r=r.times(t)),e>>=1,!e)break;t=t.times(t)}return a?n.div(r):r},g.round=function(e,t){var n=this.constructor;if(e===h)e=0;else if(e!==~~e||e<-s||e>s)throw Error(w);return I(new n(this),e,t===h?n.RM:t)},g.sqrt=function(){var e,t,n,r=this,a=r.constructor,i=r.s,o=r.e,l=new a(.5);if(!r.c[0])return new a(r);if(i<0)throw Error(u+"No square root");i=Math.sqrt(r+""),0===i||i===1/0?(t=r.c.join(""),t.length+o&1||(t+="0"),i=Math.sqrt(t),o=((o+1)/2|0)-(o<0||1&o),e=new a((i==1/0?"1e":(i=i.toExponential()).slice(0,i.indexOf("e")+1))+o)):e=new a(i),o=e.e+(a.DP+=4);do{n=e,e=l.times(n.plus(r.div(n)))}while(n.c.slice(0,o).join("")!==e.c.slice(0,o).join(""));return I(e,a.DP-=4,a.RM)},g.times=g.mul=function(e){var t,n=this,r=n.constructor,a=n.c,i=(e=new r(e)).c,o=a.length,l=i.length,s=n.e,c=e.e;if(e.s=n.s==e.s?1:-1,!a[0]||!i[0])return new r(0*e.s);for(e.e=s+c,o<l&&(t=a,a=i,i=t,c=o,o=l,l=c),t=new Array(c=o+l);c--;)t[c]=0;for(s=l;s--;){for(l=0,c=o+s;c>s;)l=t[c]+i[s]*a[c-s-1]+l,t[c--]=l%10,l=l/10|0;t[c]=(t[c]+l)%10}for(l?++e.e:t.shift(),s=t.length;!t[--s];)t.pop();return e.c=t,e},g.toExponential=function(e){return b(this,1,e,e)},g.toFixed=function(e){return b(this,2,e,this.e+e)},g.toPrecision=function(e){return b(this,3,e,e-1)},g.toString=function(){return b(this)},g.valueOf=g.toJSON=function(){return b(this,4)},i=E(),i["default"]=i.Big=i,r=function(){return i}.call(t,n,t,e),void 0===r||(e.exports=r)})()},c284:function(e,t,n){var r=n("31cc"),a=/^-?(\d+(\.\d*)?|\.\d+)(e[+-]?\d+)?$/i,i={salaryTaxForward:function(e,t,n){var a=new r(e).minus(new r(t)).minus(new r(n)),i=new r("5000"),o="0.00",l="",s="0.00",c="";if(a.lte(new r("0")))o="0.00",l="",s="0.00";else if(a.lte(i))o=a,l="",s="0.00";else for(var d=a.minus(new r(i)),m=[{level:1,start:0,end:3e3,incomeStart:0,incomeEnd:2910,rate:3,delta:0},{level:2,start:3e3,end:12e3,incomeStart:2910,incomeEnd:11010,rate:10,delta:210},{level:3,start:12e3,end:25e3,incomeStart:11010,incomeEnd:21410,rate:20,delta:1410},{level:4,start:25e3,end:35e3,incomeStart:21410,incomeEnd:2910,rate:25,delta:2660},{level:5,start:35e3,end:55e3,incomeStart:0,incomeEnd:2910,rate:30,delta:4410},{level:6,start:55e3,end:8e4,incomeStart:0,incomeEnd:2910,rate:35,delta:7160},{level:7,start:8e4,end:0,incomeStart:0,incomeEnd:2910,rate:45,delta:15160}],u=0;u<m.length;u++){var f=m[u];if(d.lte(new r(f.end))||u==m.length-1){s=d.times(new r(f.rate)).div(new r(100)).minus(new r(f.delta)).round(2,r.ROUND_HALF_UP),l=f.rate,c=f.delta,o=a.minus(s);break}}return{afterTaxIncome:o.toString(),taxRate:l,taxableIncome:a.toString(),tax:s.toString(),beforeTaxIncome:e,delta:c,threshold:i,specialDeduction:n,riskFund:t}},salaryTaxReverse:function(e,t,n){var a="",i=new r("5000"),o=new r(e),l="",s="0.00",c="",d=0;if(o.lte(i))a=o,c=o.add(new r(t)).add(new r(n)),l="",s="0.00",d=0;else for(var m=[{level:1,start:0,end:3e3,incomeStart:0,incomeEnd:2910,rate:3,delta:0},{level:2,start:3e3,end:12e3,incomeStart:2910,incomeEnd:11010,rate:10,delta:210},{level:3,start:12e3,end:25e3,incomeStart:11010,incomeEnd:21410,rate:20,delta:1410},{level:4,start:25e3,end:35e3,incomeStart:21410,incomeEnd:2910,rate:25,delta:2660},{level:5,start:35e3,end:55e3,incomeStart:0,incomeEnd:2910,rate:30,delta:4410},{level:6,start:55e3,end:8e4,incomeStart:0,incomeEnd:2910,rate:35,delta:7160},{level:7,start:8e4,end:0,incomeStart:0,incomeEnd:2910,rate:45,delta:15160}],u=0;u<m.length;u++){var f=m[u],w=o.minus(i).minus(new r(f.delta)).div(new r(100-f.rate).div(new r(100))).round(2,r.ROUND_HALF_UP);a=w.add(i);if(w.lte(new r(f.end))||u==m.length-1){s=w.times(new r(f.rate)).div(new r(100)).minus(new r(f.delta)).round(2,r.ROUND_HALF_UP),l=f.rate,d=f.delta,c=a.plus(t).plus(new r(n));break}}return{afterTaxIncome:o.toString(),taxRate:l,threshold:i,taxableIncome:a.toString(),tax:s.toString(),beforeTaxIncome:c.toString(),delta:d,specialDeduction:n,riskFund:t}},salaryTaxlList:function(){var e=[{level:1,start:0,end:3e3,incomeStart:0,incomeEnd:2910,rate:3,delta:0},{level:2,start:3e3,end:12e3,incomeStart:2910,incomeEnd:11010,rate:10,delta:210},{level:3,start:12e3,end:25e3,incomeStart:11010,incomeEnd:21410,rate:20,delta:1410},{level:4,start:25e3,end:35e3,incomeStart:21410,incomeEnd:2910,rate:25,delta:2660},{level:5,start:35e3,end:55e3,incomeStart:0,incomeEnd:2910,rate:30,delta:4410},{level:6,start:55e3,end:8e4,incomeStart:0,incomeEnd:2910,rate:35,delta:7160},{level:7,start:8e4,end:0,incomeStart:0,incomeEnd:2910,rate:45,delta:15160}];return{list:e}},yearEndBonusTaxForward:function(e){var t=new r(e),n=new r("5000"),a="0.00",i="",o="0.00",l="",s=t.div(new r("12")).round(2,r.ROUND_HALF_UP),c=[{level:1,start:0,end:3e3,incomeStart:0,incomeEnd:2910,rate:3,delta:0},{level:2,start:3e3,end:12e3,incomeStart:2910,incomeEnd:11010,rate:10,delta:210},{level:3,start:12e3,end:25e3,incomeStart:11010,incomeEnd:21410,rate:20,delta:1410},{level:4,start:25e3,end:35e3,incomeStart:21410,incomeEnd:2910,rate:25,delta:2660},{level:5,start:35e3,end:55e3,incomeStart:0,incomeEnd:2910,rate:30,delta:4410},{level:6,start:55e3,end:8e4,incomeStart:0,incomeEnd:2910,rate:35,delta:7160},{level:7,start:8e4,end:0,incomeStart:0,incomeEnd:2910,rate:45,delta:15160}];console.log("original"+s);for(var d=0;d<c.length;d++){var m=c[d];if(s.lte(new r(m.end))||d==c.length-1){o=t.times(new r(m.rate)).div(new r(100)).minus(new r(m.delta)).round(2,r.ROUND_HALF_UP),i=m.rate,l=m.delta,a=t.minus(o);break}}return{afterTaxIncome:a.toString(),taxRate:i,taxableIncome:t.toString(),tax:o.toString(),beforeTaxIncome:e,delta:l,threshold:n}},yearEndBonusTaxReverse:function(e){for(var t="",n=(new r("5000"),new r(e)),a="",i="0.00",o="",l=0,s=[{level:1,start:0,end:3e3,incomeStart:0,incomeEnd:2910,rate:3,delta:0},{level:2,start:3e3,end:12e3,incomeStart:2910,incomeEnd:11010,rate:10,delta:210},{level:3,start:12e3,end:25e3,incomeStart:11010,incomeEnd:21410,rate:20,delta:1410},{level:4,start:25e3,end:35e3,incomeStart:21410,incomeEnd:2910,rate:25,delta:2660},{level:5,start:35e3,end:55e3,incomeStart:0,incomeEnd:2910,rate:30,delta:4410},{level:6,start:55e3,end:8e4,incomeStart:0,incomeEnd:2910,rate:35,delta:7160},{level:7,start:8e4,end:0,incomeStart:0,incomeEnd:2910,rate:45,delta:15160}],c=0;c<s.length;c++){var d=s[c];t=n.minus(new r(d.delta)).div(new r(100-d.rate).div(new r(100))).round(2,r.ROUND_HALF_UP);var m=t.div(new r("12")).round(2,r.ROUND_HALF_UP);if(m.lte(new r(d.end))||c==s.length-1){i=t.times(new r(d.rate)).div(new r(100)).minus(new r(d.delta)).round(2,r.ROUND_HALF_UP),a=d.rate,l=d.delta,o=t;break}}return{afterTaxIncome:n.toString(),taxRate:a,taxableIncome:t.toString(),tax:i.toString(),beforeTaxIncome:o.toString(),delta:l}},propertyLeaseTaxForward:function(e){var t=new r(e),n=(new r("5000"),"0.00"),a="",i="0.00",o="",l="";return l=t.lte(new r(800))?new r(0):t.lte(new r(4e3))?t.minus(new r(800)):t.times(new r(1).minus(new r("0.20"))),i=l.times(new r("0.20")),n=t.minus(i),a=20,{afterTaxIncome:n.toString(),taxRate:a,taxableIncome:l.toString(),tax:i.toString(),beforeTaxIncome:e.toString(),delta:o}},propertyLeaseTaxReverse:function(e){var t="",n=(new r("5000"),new r(e)),a="",i="0.00",o="",l=0;return n.lte(new r(800))?(t=new r(0),o=n):n.lte(new r(3360))?(o=n.minus(new r(800).times(new r("0.20"))).div(new r("0.80")).round(2,r.ROUND_HALF_UP),t=o.minus(new r(800))):(o=n.div(new r(1).minus(new r("0.80")).times(new r("0.20"))).round(2,r.ROUND_HALF_UP),t=o.times(new r(1).minus(new r("0.20")))),i=t.times(new r("0.20")),a=20,{afterTaxIncome:n.toString(),taxRate:a,taxableIncome:t.toString(),tax:i.toString(),beforeTaxIncome:o.toString(),delta:l}},propertyTransferTaxForward:function(e,t,n){var a=new r(e),i=(new r("5000"),"0.00"),o="",l="0.00",s="",c="";return c=a.minus(new r(t)).minus(new r(n)),l=c.times(new r("0.20")),i=a.minus(l).minus(new r(n)),o=20,{afterTaxIncome:i.toString(),taxRate:o,propertyOriginalIncome:t.toString(),reasonableFee:n.toString(),taxableIncome:c.toString(),tax:l.toString(),beforeTaxIncome:e.toString(),delta:s}},propertyTransferTaxReverse:function(e,t,n){var a="",i=(new r("5000"),new r(e)),o="",l="0.00",s="",c=0;return s=i.plus(new r(n)).minus(new r(t).add(new r(n)).times(new r("0.20"))).div(new r("0.80")).round(2,r.ROUND_HALF_UP),a=s.minus(new r(t)).minus(new r(n)),l=a.times(new r("0.20")),o=20,{afterTaxIncome:i.toString(),taxRate:o,propertyOriginalIncome:t.toString(),reasonableFee:n,taxableIncome:a.toString(),tax:l.toString(),beforeTaxIncome:s.toString(),delta:c}},occasionalTaxForward:function(e){var t=new r(e),n=(new r("5000"),"0.00"),a="",i="0.00",o="",l="";return l=t,i=l.times(new r("0.20")),n=t.minus(i),a=20,{afterTaxIncome:n.toString(),taxRate:a,taxableIncome:l.toString(),tax:i.toString(),beforeTaxIncome:e.toString(),delta:o}},occasionalTaxReverse:function(e){var t="",n=(new r("5000"),new r(e)),a="",i="0.00",o="",l=0;return o=n.times(new r("0.20")).div(new r("0.80")).round(2,r.ROUND_HALF_UP),t=o,i=t.times(new r("0.20")),a=20,{afterTaxIncome:n.toString(),taxRate:a,taxableIncome:t.toString(),tax:i.toString(),beforeTaxIncome:o.toString(),delta:l}},institutionTaxlList:function(){var e=[{level:1,start:0,end:5e3,incomeStart:0,incomeEnd:28500,rate:5,delta:0},{level:2,start:5e3,end:1e4,incomeStart:28500,incomeEnd:82500,rate:10,delta:250},{level:3,start:1e4,end:3e4,incomeStart:82500,incomeEnd:250500,rate:20,delta:1250},{level:4,start:3e4,end:5e4,incomeStart:250500,incomeEnd:390500,rate:30,delta:4250},{level:5,start:5e4,end:0,incomeStart:390500,incomeEnd:0,rate:35,delta:6750}];return{list:e}},individualCommercialTaxForward:function(e,t){var n=new r(e).minus(new r(t)),a=new r("0"),i="0.00",o="",l="0.00",s="";if(n.lte(new r("0")))i="0.00",o="",l="0.00";else if(n.lte(a))i=n,o="",l="0.00";else for(var c=n.minus(new r(a)),d=[{level:1,start:0,end:15e3,incomeStart:0,incomeEnd:2910,rate:5,delta:0},{level:2,start:15e3,end:3e4,incomeStart:2910,incomeEnd:11010,rate:10,delta:750},{level:3,start:3e4,end:6e4,incomeStart:11010,incomeEnd:21410,rate:20,delta:3750},{level:4,start:6e4,end:1e6,incomeStart:21410,incomeEnd:2910,rate:30,delta:9750},{level:5,start:1e5,end:0,incomeStart:0,incomeEnd:2910,rate:35,delta:14750}],m=0;m<d.length;m++){var u=d[m];if(c.lte(new r(u.end))||m==d.length-1){l=c.times(new r(u.rate)).div(new r(100)).minus(new r(u.delta)).round(2,r.ROUND_HALF_UP),o=u.rate,s=u.delta,i=n.minus(l);break}}return{afterTaxIncome:i.toString(),taxRate:o,taxableIncome:n.toString(),tax:l.toString(),beforeTaxIncome:e.toString(),delta:s}},individualCommercialTaxReverse:function(e,t){var n="",a=new r("0"),i=new r(e),o="",l="0.00",s="",c=0;if(i.lte(a))n=i,s=i.add(new r(t)),o="",l="0.00",c=0;else for(var d=[{level:1,start:0,end:15e3,incomeStart:0,incomeEnd:2910,rate:5,delta:0},{level:2,start:15e3,end:3e4,incomeStart:2910,incomeEnd:11010,rate:10,delta:750},{level:3,start:3e4,end:6e4,incomeStart:11010,incomeEnd:21410,rate:20,delta:3750},{level:4,start:6e4,end:1e6,incomeStart:21410,incomeEnd:2910,rate:30,delta:9750},{level:5,start:1e5,end:0,incomeStart:0,incomeEnd:2910,rate:35,delta:14750}],m=0;m<d.length;m++){var u=d[m],f=i.minus(a).minus(new r(u.delta)).div(new r(100-u.rate).div(new r(100))).round(2,r.ROUND_HALF_UP);n=f.add(a);if(f.lte(new r(u.end))||m==d.length-1){l=f.times(new r(u.rate)).div(new r(100)).minus(new r(u.delta)).round(2,r.ROUND_HALF_UP),o=u.rate,c=u.delta,s=n.plus(t);break}}return{afterTaxIncome:i.toString(),taxRate:o,taxableIncome:n.toString(),tax:l.toString(),beforeTaxIncome:s.toString(),delta:c}},individualCommercialTaxlList:function(){var e=[{level:1,start:0,end:15e3,incomeStart:0,incomeEnd:2910,rate:5,delta:0},{level:2,start:15e3,end:3e4,incomeStart:2910,incomeEnd:11010,rate:10,delta:750},{level:3,start:3e4,end:6e4,incomeStart:11010,incomeEnd:21410,rate:20,delta:3750},{level:4,start:6e4,end:1e6,incomeStart:21410,incomeEnd:2910,rate:30,delta:9750},{level:5,start:1e5,end:0,incomeStart:0,incomeEnd:2910,rate:35,delta:14750}];return{list:e}},enterpriseInstitutionTaxForward:function(e,t){var n=new r(e),a=new r("3500"),i="0.00",o="",l="0.00",s="",c=n;if(c.lte(a.times(new r(t))))l=new r(0),o=0,i=c.minus(l);else for(var d=c.minus(a.times(new r(t))),m=[{level:1,start:0,end:5e3,incomeStart:0,incomeEnd:28500,rate:5,delta:0},{level:2,start:5e3,end:1e4,incomeStart:28500,incomeEnd:82500,rate:10,delta:250},{level:3,start:1e4,end:3e4,incomeStart:82500,incomeEnd:250500,rate:20,delta:1250},{level:4,start:3e4,end:5e4,incomeStart:250500,incomeEnd:390500,rate:30,delta:4250},{level:5,start:5e4,end:0,incomeStart:390500,incomeEnd:0,rate:35,delta:6750}],u=0;u<m.length;u++){var f=m[u];if(d.lte(new r(f.end))||u==m.length-1){l=d.times(new r(f.rate)).div(new r(100)).minus(new r(f.delta)).round(2,r.ROUND_HALF_UP),o=f.rate,s=f.delta,i=c.minus(l);break}}return{afterTaxIncome:i.toString(),taxRate:o,taxableIncome:c.toString(),tax:l.toString(),beforeTaxIncome:e.toString(),delta:s}},enterpriseInstitutionTaxReverse:function(e,t){var n="",a=new r("3500"),i=new r(e),o="",l="0.00",s="",c=0;if(i.lte(a.times(new r(t))))n=i,l=new r(0),o=0,c=0,s=i;else for(var d=[{level:1,start:0,end:5e3,incomeStart:0,incomeEnd:28500,rate:5,delta:0},{level:2,start:5e3,end:1e4,incomeStart:28500,incomeEnd:82500,rate:10,delta:250},{level:3,start:1e4,end:3e4,incomeStart:82500,incomeEnd:250500,rate:20,delta:1250},{level:4,start:3e4,end:5e4,incomeStart:250500,incomeEnd:390500,rate:30,delta:4250},{level:5,start:5e4,end:0,incomeStart:390500,incomeEnd:0,rate:35,delta:6750}],m=0;m<d.length;m++){var u=d[m],f=i.minus(a.times(new r(t))).minus(new r(u.delta)).div(new r(100-u.rate).div(new r(100))).round(2,r.ROUND_HALF_UP);n=f.add(a.times(new r(t)));if(f.lte(new r(u.end))<1||m==d.length-1){l=f.times(new r(u.rate)).div(new r(100)).minus(new r(u.delta)).round(2,r.ROUND_HALF_UP),o=u.rate,c=u.delta,i=n.minus(l),s=n;break}}return{afterTaxIncome:i.toString(),taxRate:o,taxableIncome:n.toString(),tax:l.toString(),beforeTaxIncome:s.toString(),delta:c}},socialHousingCalculator:function(e,t,n){var i=new r(n.endowmentInsurance.personPercent).plus(new r(n.medicalInsurance.personPercent)).plus(new r(n.unemploymentInsurance.personPercent)).plus(new r(n.employmentInjuryInsurance.personPercent)).plus(new r(n.maternityInsurance.personPercent)),o=new r(0);if(a.test(e)){l=new r(e).times(i).div(new r(100)).round(2,r.ROUND_HALF_UP).plus(new r(n.medicalInsurance.delta));o=o.plus(l)}else var l="";if(a.test(t)){s=new r(n.housingFundInsurance.personPercent).times(new r(t)).div(new r(100)).round(2,r.ROUND_HALF_UP);o=o.plus(s)}else var s="";return{totalPerson:o.toString(),socialPerson:l.toString(),housingPerson:s.toString()}}};e.exports={taxCalculator:i}}}]);