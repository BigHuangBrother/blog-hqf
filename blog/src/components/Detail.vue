<template id="detial">
  <div class="detail-box">
    <h1 class="article-detail-t">{{detailNum}}Netty堆外内存泄露排查盛宴</h1>
    <span class="article-secondary">闪电侠 2018-10-23</span>
    <div class="article-detail-content">
      导读
      Netty 是一个异步事件驱动的网络通信层框架，用于快速开发高可用高性能的服务端网络框架与客户端程序，它极大地简化了 TCP 和 UDP 套接字服务器等网络编程。

      Netty 底层基于 JDK 的 NIO，我们为什么不直接基于 JDK 的 NIO 或者其他NIO框架：

      使用 JDK 自带的 NIO 需要了解太多的概念，编程复杂。
      Netty 底层 IO 模型随意切换，而这一切只需要做微小的改动。
      Netty自带的拆包解包，异常检测等机制让我们从 NIO 的繁重细节中脱离出来，只需关心业务逻辑即可。
      Netty解决了JDK 的很多包括空轮训在内的 Bug。
      Netty底层对线程，Selector 做了很多细小的优化，精心设计的 Reactor 线程做到非常高效的并发处理。
      自带各种协议栈，让我们处理任何一种通用协议都几乎不用亲自动手。
      Netty社区活跃，遇到问题随时邮件列表或者 issue。
      Netty已经历各大RPC框架（Dubbo），消息中间件（RocketMQ），大数据通信（Hadoop）框架的广泛的线上验证，健壮性无比强大。</div>
  </div>
</template>

<script>
  export default {
  }
</script>
