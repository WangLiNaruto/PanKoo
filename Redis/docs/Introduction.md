# Redis 简介

## Redis是什么
    Redis是一种基于key-value的内存型的NoSql数据库
    有丰富的数据结构-字符串(string)、列表(list)、哈希(hash)、集合(set)、有序结合(zset)、位图(Bitmaps)、HyperLogLog、GEO(地理信息定位)等.
    Redis数据存放在内存中，读写性能惊人.Redis持久化时，将内存中的数据利用快照(RDB)或者日志(AOF)的形式持久化到硬盘上，保证内存中的数据不丢失.
    Redis还提供键过期、发布订阅、事务、流水线、Lua脚本等功能

## Redis的优点

### 速度快
* Redis的所有数据存放于内存中
* Redis是c语言实现(直接在操作系统上执行，执行速度快)
* Redis是单线程架构(避免多线程可能产生的竞争问题)
* Redis的源代码集性能和优雅于一身

### 功能丰富
* `键过期`(缓存实现)
* `发布订阅`(消息系统)
* `Lua脚本`(创造Redis命令)
* `事务`(一定程度保证事务特性)
* `流水线Pipeline`(客户端将一批命令一次性传到Redis,减少网络开销)

### 简单稳定
* 源代码少
* Redis使用单线程架构-不仅使Redis服务端处理模型简单，而且客户端开发也简单
* Redis不需要依赖操作系统中其他的类库(Memcache依赖libEvent这样的类库)，Redis自己实现了事件处理的功能

### 客户端语言多
* Redis提供简单的TCP协议，很多编程语言方便接入Redis
* Redis开源社区受到广泛认可，支持Redis的客户端语言众多-java、python、c/c++、NodeJs等

### 持久化
* RDB
* AOF

### 主从复制
* Redis提供复制功能，实现多个相同数据的Redis副本，复制功能是分布式Redis的基础

### 高可用和分布式
* Redis2.8 提供了高可用实现Redis Sentinel,它能保证Redis节点的故障发现和故障转移
* Redis3.0 提供了分布式实现Redis Cluster,它是Redis真正的分布式实现，提供高可用、读写和容量的扩展性

## Redis的使用场景

### 可以做
* `缓存`
   
  合理的使用缓存不仅可以使数据的访问速度加快，也可以降低后端数据源的压力,redis提供键过期时间设置、控制最大内存和内存溢出的淘汰策略

* `排行榜系统`
  
  列表+有序集合

* `计数器`

  redis天然支持技术功能且性能非常好

* `消息队列系统` 
  
  发布订阅+阻塞队列

* `社交网络`

### 不可以做
* 数据规模
  数据可以分为大规模和小规模数据，Redis存储数据与内存中，如果大规模数据存储内存中，经济成本相当高
* 数据冷热
  数据分为热数据和冷数据，热数据指需要频繁操作的数据，反之为冷数据
  如果将冷数据存储在内存中，将加大内存消耗

## Redis Shell
  redis安装后，在其安装目录下有几个以redis开头的可执行文件-redis shell
  | 可执行文件                | 作用                             |
  | -----------------------  | ----------------------------    |
  | redis-server             | 启动redis                       |
  | redis-cli                | redis命令行客户端                |
  | redis-benchmark          | redis基准测试工具                |
  | redis-check-aof          | redis aof持久化文件检测和修复工具  |
  | redis-check-dump         | redis rdb持久化文件检测和修复工具  |
  | redis-sentinel           | 启动redis sentinel              |

### 启动

* 默认配置:使用redis的默认配置启动

```shell
redis-server
```

* 运行启动：reddis-server加上修改配置名称和值

```shell
redis-server --port 6380
```

* 配置文件启动:将配置写到制定文件里(/opt/redis/redis.conf)
  
```shell
redis-server /opt/redis/redis.conf
```

### 链接

* 交互式方式：

```shell
redis-cli -h 127.0.0.7 -p 6379
```

* 命令方式：

```shell
redis-cli -h 127.0.0.7 -p 6379 set key value
```
### 停止
  redis提供shutdown来停止redis服务，shutdown 还有一个参数。代表是否在关闭redis前生成持久化文件
```shell
redis-cli shutdown nosave|save
```


