<#assign title="某宝网 - 淘！我喜欢"/>

<@override name="style">
<link rel="stylesheet" href="${ctx}static/app/css/web/index/index.css"/>
</@override>

<@override name="content">
<div class="header">
    <a class="logo pull-left" href="${ctx}/"></a>
    <div class="show-lg pull-left space-50"></div>
    <div class="pull-left space-50"></div>
    <div class="pull-left">
        <div class="header-tabs">
            <a href="#" class="active">宝贝</a>
            <a href="#">天猫</a>
            <a href="#">店铺</a>
        </div>
        <div>
            <div class="relative pull-left">
                <input type="text" name="key" class="header-search-input" placeholder="中秋上某宝买月饼"/>
                <i class="fa fa-fw fa-search fa-150 header-search-icon"></i>
            </div>
            <button class="pull-left header-search">搜索</button>
            <a href="#" class="pull-left text ahover header-search-multi">高级搜索</a>
        </div>
        <div class="clear">
            <ul class="header-nav">
                <li class="pull-left"><a href="#" class="ahover active">毛绒娃娃</a></li>
                <li class="pull-left"><a href="#" class="ahover">男鞋</a></li>
                <li class="pull-left"><a href="#" class="ahover active">衬衫</a></li>
                <li class="pull-left"><a href="#" class="ahover">时装女包</a></li>
                <li class="pull-left"><a href="#" class="ahover">妈妈装</a></li>
                <li class="pull-left"><a href="#" class="ahover active">长袖女T恤</a></li>
                <li class="pull-left"><a href="#" class="ahover">夹克</a></li>
                <li class="pull-left"><a href="#" class="ahover">T恤</a></li>
                <li class="pull-left"><a href="#" class="ahover">男运动鞋</a></li>
                <li class="pull-left"><a href="#" class="ahover">沙发</a></li>
                <li class="pull-left"><a href="#" class="ahover">男包</a></li>
                <li class="pull-left"><a href="#" class="ahover">男长袖T恤</a></li>
                <li class="pull-left"><a href="#" class="ahover">休闲裤</a></li>
                <li class="pull-right more"><a href="#" class="ahover">更多 ></a></li>
            </ul>
        </div>
    </div>
    <div class="show-lg pull-left space-50"></div>
    <div class="show-lg pull-left space-50"></div>
    <div class="show-lg pull-left space-50"></div>
    <div class="pull-left relative">
        <a href="#" class="header-code">
            <span>手机某宝</span>
            <img src="${ctx}/static/app/img/code.webp" alt="手机某宝"/>
        </a>
        <a href="#" target="_self" class="header-code-close">
            x
        </a>
    </div>
</div>

<div class="main clear">
    <div class="main-top-panel">
        <div class="main-top-container">
            <div class="main-top-menu pull-left">
                <a href="#" class="color-white">主题市场</a>
                <a href="#" class="color-white pull-right">
                    <i class="fa fa-fw fa-list-ul"></i>
                </a>
            </div>
            <div class="main-top-nav pull-left">
                <ul class="pull-left">
                    <li class="pull-left"><a href="#">天猫</a></li>
                    <li class="pull-left"><a href="#">聚划算</a></li>
                    <li class="pull-left"><a href="#">天猫超市</a></li>
                </ul>
                <div class="pull-left face-nav-limit">|</div>
                <ul class="pull-left face-nav-list">
                    <li class="pull-left"><a href="#">淘抢购</a></li>
                    <li class="pull-left"><a href="#">电器城</a></li>
                    <li class="pull-left"><a href="#">司法拍卖</a></li>
                    <li class="pull-left"><a href="#">中国质造</a></li>
                    <li class="pull-left"><a href="#">特色中国</a></li>
                </ul>
                <div class="pull-left face-nav-limit show-lg">|</div>
                <ul class="pull-left face-nav-list show-lg">
                    <li class="pull-left"><a href="#">阿里旅行</a></li>
                    <li class="pull-left"><a href="#">智能生活</a></li>
                    <li class="pull-left"><a href="#">苏宁易购</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="main-container">
        <div class="face">
            <div class="pull-left face-left">
                <div class="face-menu pull-left">
                    <ul>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">女装</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">男装</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">内衣</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">鞋靴</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">箱包</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">配件</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">童装玩具</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">孕产</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">用品</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">家电</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">数码</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">手机</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">美妆</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">洗护</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">保健品</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">珠宝</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">眼镜</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">手表</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">运动</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">户外</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">乐器</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">游戏</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">动漫</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">影视</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">美食</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">生鲜</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">零食</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">鲜花</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">宠物</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">农资</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">房产</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">装修</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">建材</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">家具</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">家饰</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">家纺</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">汽车</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">二手车</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">用品</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">办公</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">DIY</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">五金电子</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">百货</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">餐厨</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">家庭保健</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                        <li>
                            <i class="fa fa-fw fa-leaf color-orange2"></i>
                            <a href="#" class="color-white">学习</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">卡券</a>
                            <span class="color-white">/</span>
                            <a href="#" class="color-white">本地服务</a>
                            <i class="fa fa-fw fa-chevron-right color-white"></i>
                        </li>
                    </ul>
                    <a class="face-menu-bottom" href="#"></a>
                </div>
                <div class="face-content-left pull-left">
                    <div class="face-banner-top">
                    </div>
                    <div class="face-banner-bottom">
                        <div class="face-banner-bottom-header">
                            <div class="pull-left img">天猫必逛</div>
                            <div class="pull-left title">热门品牌,天天上天猫!</div>
                            <div class="pull-right info"><span>4</span>/6</div>
                        </div>
                        <div class="face-banner-bottom-container">
                            <img src="${ctx}/static/app/img/banner01.webp" class="banner-img"/>
                            <img src="${ctx}/static/app/img/banner02.webp" class="banner-img"/>
                            <img src="${ctx}/static/app/img/banner03.webp" class="banner-img"/>
                            <img src="${ctx}/static/app/img/banner04.webp" class="banner-img no-right-border"/>

                            <img src="${ctx}/static/app/img/banner05.webp" class="banner-img"/>
                            <img src="${ctx}/static/app/img/banner06.webp" class="banner-img"/>
                            <img src="${ctx}/static/app/img/banner07.webp" class="banner-img"/>
                            <img src="${ctx}/static/app/img/banner08.webp" class="banner-img no-right-border"/>

                            <img src="${ctx}/static/app/img/banner09.webp" class="banner-img no-bottom-border"/>
                            <img src="${ctx}/static/app/img/banner10.webp" class="banner-img no-bottom-border"/>
                            <img src="${ctx}/static/app/img/banner11.webp" class="banner-img no-bottom-border"/>
                            <img src="${ctx}/static/app/img/banner12.webp"
                                 class="banner-img no-bottom-border no-right-border"/>
                        </div>
                    </div>
                </div>
                <div class="show-lg face-content-right pull-left">
                    <a href="#" class="content-right-top"></a>
                    <div>今日热卖</div>
                    <a href="#" class="content-right-bottom"></a>
                </div>
                <div class="clear face-bottom pull-left">
                    <div class="pull-left face01">
                        <div class="img">
                            <a href="#"><img src="${ctx}/static/app/img/face01.jpg"/></a>
                        </div>
                        <div class="info">
                            <a href="#" class="strong">蕾丝控</a>
                            <a href="#">少女蕾丝心</a>
                            <a href="#" class="color-dark"><i class="fa fa-fw fa-fire"></i>人气13981</a>
                        </div>
                    </div>
                    <div class="pull-left face02">
                        <div class="img">
                            <a href="#"><img src="${ctx}/static/app/img/face02.jpg"/></a>
                        </div>
                        <div class="info">
                            <a href="#" class="strong">太平公主</a>
                            <a href="#">平常心平常胸</a>
                            <a href="#" class="color-dark"><i class="fa fa-fw fa-fire"></i>人气12959</a>
                        </div>
                    </div>
                    <div class="pull-left face03">
                        <div class="img">
                            <a href="#"><img src="${ctx}/static/app/img/face03.jpg"/></a>
                        </div>
                        <div class="info">
                            <a href="#" class="strong">手机重患者</a>
                            <a href="#">就是爱搞机</a>
                            <a href="#" class="color-dark"><i class="fa fa-fw fa-fire"></i>人气86126</a>
                        </div>
                    </div>
                    <div class="pull-left face04">
                        <div class="img">
                            <a href="#"><img src="${ctx}/static/app/img/face04.jpg"/></a>
                        </div>
                        <div class="info">
                            <a href="#" class="strong">手表控</a>
                            <a href="#">有它有型有范</a>
                            <a href="#" class="color-dark"><i class="fa fa-fw fa-fire"></i>人气37505</a>
                        </div>
                    </div>
                    <div class="pull-left face05 show-lg">
                        <div class="img">
                            <a href="#"><img src="${ctx}/static/app/img/face05.jpg"/></a>
                        </div>
                        <div class="info">
                            <a href="#" class="strong">新主妇时代</a>
                            <a href="#">戴着镣铐跳舞</a>
                            <a href="#" class="color-dark"><i class="fa fa-fw fa-fire"></i>人气67220</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="face-right pull-left">
                <div class="face-right-login">
                    <a href="#"><img src="${ctx}/static/app/img/user.jpg"></a>
                    <div class="hello">Hi! 你好</div>
                    <div class="coin">
                        <a href="#" class="img-coin"></a>
                        <a href="#" class="link color-orange">领淘金币抵钱</a>
                        <span>或去</span>
                        <a href="#" class="link color-orange">会员俱乐部</a>
                    </div>
                    <div class="btn-group">
                        <a href="#">登录</a>
                        <a href="#">注册</a>
                        <a href="#">开店</a>
                    </div>
                    <div class="tabs clear">
                        <ul>
                            <li><a href="#" class="active">公告</a></li>
                            <li><a href="#">规则</a></li>
                            <li><a href="#">论坛</a></li>
                            <li><a href="#">安全</a></li>
                            <li><a href="#">公益</a></li>
                        </ul>
                        <div class="clear">
                            <a href="#" class="active">金桂初绽细雨迷人 阿里迎来亲爱的郎平指导</a>
                            <a href="#">上天猫预购iPhone7啦！ 天猫超市“订单价对折”</a>
                        </div>
                    </div>
                    <div class="patch">
                        <ul class="patch-list">
                            <li>
                                <a href="#" class="patch-01">
                                    <div class="patch-img"></div>
                                    充话费
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-02">
                                    <div class="patch-img"></div>
                                    游戏
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-03">
                                    <div class="patch-img"></div>
                                    旅行
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-04 no-right-border">
                                    <div class="patch-img"></div>
                                    保险
                                </a>
                            </li>

                            <li>
                                <a href="#" class="patch-05">
                                    <div class="patch-img"></div>
                                    彩票
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-06">
                                    <div class="patch-img"></div>
                                    电影
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-07">
                                    <div class="patch-img"></div>
                                    点外卖
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-08 no-right-border">
                                    <div class="patch-img"></div>
                                    理财
                                </a>
                            </li>

                            <li>
                                <a href="#" class="patch-09 no-bottom-border">
                                    <div class="patch-img"></div>
                                    找服务
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-10 no-bottom-border">
                                    <div class="patch-img"></div>
                                    音乐
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-11 no-bottom-border">
                                    <div class="patch-img"></div>
                                    水电煤
                                </a>
                            </li>
                            <li>
                                <a href="#" class="patch-12 no-bottom-border no-right-border">
                                    <div class="patch-img"></div>
                                    火车票
                                </a>
                            </li>
                        </ul>
                    </div>
                    <div class="app">
                        <div class="app-header">
                            <a href="#" class="pull-left strong">阿里APP</a>
                            <a href="#" class="pull-right more">
                                更多
                                <i class="fa fa-fw fa-chevron-right"></i>
                            </a>
                        </div>
                        <div>
                            <ul class="app-list">
                                <li><a href="#"><img src="${ctx}/static/app/img/app01.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app02.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app03.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app04.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app05.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app06.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app07.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app08.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app09.webp"/></a></li>
                                <li><a href="#"><img src="${ctx}/static/app/img/app10.webp"/></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="space-10"></div>
        <div class="space-10"></div>
        <div class="favorite">
            <div class="fav-content">
                <div class="space-10"></div>
                <div class="favorite-header">
                    <div class="title">
                        <div>
                            <div></div>
                            <div class="content">
                                <i class="fa fa-fw fa-heart-o color-red"></i>猜你喜欢
                            </div>
                            <div></div>
                        </div>
                    </div>
                    <div class="clear text-center color-dark2">实时推荐最适合你的宝贝</div>
                </div>
                <ul class="fav-list">
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav01.jpg"/>
                            <div class="desc">牧野旷歌2015秋冬新款女式修身圆领开衫羊绒衫产自鄂尔多斯市热卖</div>
                            <div class="price">¥378.67</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav02.jpg"/>
                            <div class="desc">韩式 超实用白色宜家儿童自由组合书柜书橱书架书柜</div>
                            <div class="price">¥176</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav03.jpg"/>
                            <div class="desc">包邮新阳光太阳能14合一1机器人益智力科普拼装玩具科技小制作</div>
                            <div class="price">¥24</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav04.jpg"/>
                            <div class="desc">秋冬新款运动套装女休闲套装时尚卫衣三件套</div>
                            <div class="price">¥298</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav05.jpg"/>
                            <div class="desc">人工天空蓝鳌虾 纯种人工天空蓝魔虾9厘米</div>
                            <div class="price">¥110</div>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav06.jpg"/>
                            <div class="desc">中式民国风 盘扣女装 提花棉斜襟棉袍 夹衣</div>
                            <div class="price">¥168</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav07.jpg"/>
                            <div class="desc">强象书房家具 组合推拉门书柜防尘玻璃门储物柜单个书橱书架F-008</div>
                            <div class="price">¥2289.6</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav08.jpg"/>
                            <div class="desc">秋装大码卫衣</div>
                            <div class="price">¥69</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav09.jpg"/>
                            <div class="desc">螃蟹王国 模型拼装diy 科技手工制作 同步走机器人 DIY机器人</div>
                            <div class="price">¥21</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav10.jpg"/>
                            <div class="desc">特价草虾黑壳虾，除藻虾120只江浙沪21元包邮快来抢购</div>
                            <div class="price">¥21</div>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav11.jpg"/>
                            <div class="desc">婚纱实体店 艾慕高端奢华婚纱礼服 免费试穿</div>
                            <div class="price">¥99</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav12.jpg"/>
                            <div class="desc">净化水质植物水培鱼缸浮萍装饰水草虾水族箱</div>
                            <div class="price">¥1.95</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav13.jpg"/>
                            <div class="desc">奥视界儿童科学实验大礼包显微镜天文望远镜放大镜万花筒科普入门</div>
                            <div class="price">¥169</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav14.jpg"/>
                            <div class="desc">实木展示柜书架 两门书柜货柜 中式陈列柜酒水柜仿古家具落地柜</div>
                            <div class="price">¥1248</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav15.jpg"/>
                            <div class="desc">COCOBELLA秋装新款宽松套头女士长袖T恤卫衣</div>
                            <div class="price">¥279</div>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav16.jpg"/>
                            <div class="desc">包邮未来之星编程教育机器人配件 4通道遥控组件 遥控器</div>
                            <div class="price">¥45</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav17.jpg"/>
                            <div class="desc">秋冬风修身旗袍上衣棉袄盘扣中式唐装女棉衣</div>
                            <div class="price">¥268</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav18.jpg"/>
                            <div class="desc">物理类螃蟹8岁拼装小车制作手工制作材料太阳能玩具车科学实验</div>
                            <div class="price">¥18</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav19.jpg"/>
                            <div class="desc">Android安全技术揭秘与防范</div>
                            <div class="price">¥49.6</div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="${ctx}/static/app/img/fav20.jpg"/>
                            <div class="desc">包邮 怀旧专场◆◆儿时最爱万花筒*童年神奇万花筒百变玩具留念</div>
                            <div class="price">¥19.9</div>
                        </a>
                    </li>
                </ul>
                <div class="space-10"></div>
                <div class="favorite-footer">
                    <div class="title">
                        <div>
                            <div></div>
                            <div class="content">
                                END
                            </div>
                            <div></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</@override>

<@override name="script">
<script src="${ctx}static/app/js/web/index/index.js"></script>
</@override>

<@extends name="../layout.ftl"/>
