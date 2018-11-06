<template>
  <div id="app">
    <div class="leftSide">
      <!--logo-->
      <h4 class="logo-box">
        <span class="logo-text">黄秦峰博客</span><span class="iconfont icon-boke"></span>
      </h4>
      <ul class="list-group">
        <!--使用指令v-link进行导航-->
        <li>
          <router-link to="/">最新发布</router-link>
        </li>
        <li>
          <router-link to="/library">归档目录</router-link>
        </li>
        <li>
          <router-link to="/about">关于我</router-link>
        </li>
        <li>
          <router-link to="/contact">友情链接</router-link>
        </li>
      </ul>
      <div class="footer"><span class="copyright">© 2018 秦峰博客</span><span class="copyright">All rights reserved.</span>
      </div>
    </div>
    <div class="rightContent">
      <router-view></router-view>
    </div>
    <!--phone nav-->
    <div class="header-nav">
      <h4 class="logo-box">
        <span class="logo-text">黄秦峰博客</span><span class="iconfont icon-boke"></span>
      </h4>
      <a class="menu-btn" @click="switchMenu">
        <span class="iconfont icon-menu2"></span>
      </a>
      <ul class="phone-menu-list" v-if="showMenu">
        <!--使用指令v-link进行导航-->
        <li @click="hideMenu">
          <router-link to="/">最新发布</router-link>
        </li>
        <li @click="hideMenu">
          <router-link to="/library">归档目录</router-link>
        </li>
        <li @click="hideMenu">
          <router-link to="/about">关于我</router-link>
        </li>
        <li @click="hideMenu">
          <router-link to="/contact">友情链接</router-link>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        showMenu:false
      }
    }
    ,methods: {
      switchMenu: function () {
        this.showMenu = !this.showMenu;
      },hideMenu:function(){
        this.showMenu = !this.showMenu;
      }
    }
  }
</script>
