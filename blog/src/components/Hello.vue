<template id="hello">
  <div class="latest-release-page">
    <h4 class="page-title"><span>最新发布</span></h4>
    <!--content-->
    <div class="content-page-box">
      <ul class="content-page-ul">
        <li v-for="(item,index) in articleList" @click="showDetail(index)">
          <router-link to="./detail">
            <h4 class="article-title">{{item.title}}</h4>
            <span class="author">{{item.author}}</span>
            <span class="article-date">{{item.date}}</span>
            <p class="article-preview">{{item.preview}}</p>
          </router-link>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
  import {VistorService} from './VisitorService';

  export default {
    '/hello': 'Hello',
    data() {
      return {
        articleList: [
          {
            title: "黄老大的第一个博客",
            author: "Mr. huang",
            date: "2018-10-23",
            preview: "Netty是互联网通信领域无可争议的王者，但是一旦使用方式不对，就会带来灾难。这篇文章，我们经历了一个使用Netty的WebSocket框架",
          }, {
            title: "黄老大的第一个博客",
            author: "Mr. huang",
            date: "2018-10-23",
            preview: "Netty是互联网通信领域无可争议的王者，但是一旦使用方式不对，就会带来灾难。这篇文章，我们经历了一个使用Netty的WebSocket框架",
          }, {
            title: "黄老大的第一个博客",
            author: "Mr. huang",
            date: "2018-10-23",
            preview: "Netty是互联网通信领域无可争议的王者，但是一旦使用方式不对，就会带来灾难。这篇文章，我们经历了一个使用Netty的WebSocket框架",
          }, {
            title: "黄老大的第一个博客",
            author: "Mr. huang",
            date: "2018-10-23",
            preview: "Netty是互联网通信领域无可争议的王者，但是一旦使用方式不对，就会带来灾难。这篇文章，我们经历了一个使用Netty的WebSocket框架",
          }, {
            title: "黄老大的第一个博客",
            author: "Mr. huang",
            date: "2018-10-23",
            preview: "Netty是互联网通信领域无可争议的王者，但是一旦使用方式不对，就会带来灾难。这篇文章，我们经历了一个使用Netty的WebSocket框架",
          }
        ]
      }
    },
    methods:{
//      传入对应的文章序号，用来展示
      showDetail:function(ele){
        VistorService.test().then(data=>{
          console.info(data);
        });
        this.detailNum=ele;
      }
    }
  }
</script>
