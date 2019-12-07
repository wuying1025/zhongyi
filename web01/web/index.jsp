<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div id="header">
        <div id="header-wrapper">
            <div class="header-left">Welcome to our online store!</div>
            <ul class="header-right">
                <li class="list" id="list-language">
                    <div id="list-btn">English (USD) </div>
                    <!-- 子菜单 -->
                    <ul class="sub-list" style="display: none;">
                        <li>French (EUR)</li>
                        <li>Japanese (JPY)</li>
                    </ul>
                </li>
                <li class="list">|</li>
                <li class="list">
                    <a href="/login.jsp">Login </a>or
                    <a href="register.jsp">Register</a>
                </li>
            </ul>
        </div>
    </div>
    <div id="header2">
        <!-- 左侧logo -->
        <img class="header2-logo" src="images/logo.png" alt="">
        <!-- 中间搜索框 -->
        <div class="header2-search">
            <div class="search-left">Accessories </div>
            <div class="search-line">|</div>
            <div class="search-right">
                <input class="search-ipt" type="text" placeholder="Search Here">
                <button class="search-btn"></button>
            </div>
        </div>
        <!-- 右侧个人中心 -->
        <div class="header2-info">
            <img class="info-bag" src="images/bag.png" alt="">
            <span class="count">0</span>
            <!-- <img src="" alt=""> -->
        </div>
    </div>
    <div id="swipe-box" class="wrapper">
        <!-- 左侧轮播图 左浮 -->
        <div class="slide-container">
            <ul class="img-box">
                <li><img src="images/1.jpg" alt=""></li>
                <li><img src="images/2.jpg" alt=""></li>
                <li><img src="images/3.jpg" alt=""></li>
            </ul>
            <ul class="btn-box">
                <li class="active"></li>
                <li></li>
                <li></li>
            </ul>
        </div>
        <!-- 右侧banner右浮 -->
        <div class="banner-container">
            <ul>
                <li class="banner-list banner-list1">
                    <h2>Lighting Collection</h2>
                    <p>Inspire ur lighting style with us.
                    </p>
                    <button>SHOP NOW</button>
                </li>
                <li class="banner-list banner-list2">
                    <h2>Lighting Collection</h2>
                    <p>Vereesa style, day by day!
                    </p>
                    <button>SHOP NOW</button>
                </li>
            </ul>
        </div>
    </div>
    <div class="wrapper">
        <div class="deal-title">
            <div class="title-line"></div>
            <div class="title-txt">Deal of the day</div>
        </div>
        <div class="deal-list-box">
            <ul class="deal-list">
                <li>
                    <img class="list-img" src="images/product-item-17.jpg" alt="">
                    <div class="timer-box">
                        <div class="time-list">
                            <p>00</p>
                            <p>Days</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Hrs</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Mins</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Secs</p>
                        </div>
                    </div>
                    <h3>Plastic Dining Chair</h3>
                    <div class="star-box">
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star"></span>
                        <span class="star"></span>
                    </div>

                    <span class="deal-new">NEW</span>
                    <span class="deal-like"></span>
                    <span class="deal-big"></span>
                    <div class="deal-cart">
                        <button>ADD TO CART</button>
                    </div>
                </li>
                <li>
                    <img class="list-img" src="images/product-item-17.jpg" alt="">
                    <div class="timer-box">
                        <div class="time-list">
                            <p>00</p>
                            <p>Days</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Hrs</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Mins</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Secs</p>
                        </div>
                    </div>
                    <h3>Plastic Dining Chair</h3>
                    <div class="star-box">
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star"></span>
                        <span class="star"></span>
                    </div>

                    <span class="deal-new">NEW</span>
                    <span class="deal-like"></span>
                    <span class="deal-big"></span>
                    <div class="deal-cart">
                        <button>ADD TO CART</button>
                    </div>
                </li>
                <li>
                    <img class="list-img" src="images/product-item-17.jpg" alt="">
                    <div class="timer-box">
                        <div class="time-list">
                            <p>00</p>
                            <p>Days</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Hrs</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Mins</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Secs</p>
                        </div>
                    </div>
                    <h3>Plastic Dining Chair</h3>
                    <div class="star-box">
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star"></span>
                        <span class="star"></span>
                    </div>

                    <span class="deal-new">NEW</span>
                    <span class="deal-like"></span>
                    <span class="deal-big"></span>
                    <div class="deal-cart">
                        <button>ADD TO CART</button>
                    </div>
                </li>
                <li>
                    <img class="list-img" src="images/product-item-17.jpg" alt="">
                    <div class="timer-box">
                        <div class="time-list">
                            <p>00</p>
                            <p>Days</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Hrs</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Mins</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Secs</p>
                        </div>
                    </div>
                    <h3>Plastic Dining Chair</h3>
                    <div class="star-box">
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star"></span>
                        <span class="star"></span>
                    </div>

                    <span class="deal-new">NEW</span>
                    <span class="deal-like"></span>
                    <span class="deal-big"></span>
                    <div class="deal-cart">
                        <button>ADD TO CART</button>
                    </div>
                </li>
                <li>
                    <img class="list-img" src="images/product-item-17.jpg" alt="">
                    <div class="timer-box">
                        <div class="time-list">
                            <p>00</p>
                            <p>Days</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Hrs</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Mins</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Secs</p>
                        </div>
                    </div>
                    <h3>Plastic Dining Chair</h3>
                    <div class="star-box">
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star"></span>
                        <span class="star"></span>
                    </div>

                    <span class="deal-new">NEW</span>
                    <span class="deal-like"></span>
                    <span class="deal-big"></span>
                    <div class="deal-cart">
                        <button>ADD TO CART</button>
                    </div>
                </li>
                <li>
                    <img class="list-img" src="images/product-item-17.jpg" alt="">
                    <div class="timer-box">
                        <div class="time-list">
                            <p>00</p>
                            <p>Days</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Hrs</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Mins</p>
                        </div>
                        <div class="time-list">
                            <p>00</p>
                            <p>Secs</p>
                        </div>
                    </div>
                    <h3>Plastic Dining Chair</h3>
                    <div class="star-box">
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star star-active"></span>
                        <span class="star"></span>
                        <span class="star"></span>
                    </div>

                    <span class="deal-new">NEW</span>
                    <span class="deal-like"></span>
                    <span class="deal-big"></span>
                    <div class="deal-cart">
                        <button>ADD TO CART</button>
                    </div>
                </li>
            </ul>
        </div>
        <ul class="deal-btn">
            <li class="active"></li>
            <li></li>
            <li></li>
        </ul>
    </div>
    <script src="js/jquery-1.12.4.js"></script>
    <script src="js/index.js"></script>
</body>

</html>