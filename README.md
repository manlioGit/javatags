# JavaTags

JavaTags is a small XML/HTML construction templating library for Java, inspired by [lihaoyi's work](https://github.com/lihaoyi/scalatags). 

It can renders fragments like:

```java
import static com.github.manliogit.javatags.lang.HtmlHelper.*;

html5(attr("lang -> en"),
  head(
    meta(attr("http-equiv -> Content-Type", "content -> text/html; charset=UTF-8")),
    title("title"),
    link(attr("href -> xxx.css", "rel -> stylesheet"))
  )
).render();
```

in html:

```html
<!DOCTYPE html>
<html lang='en'>
  <head>
    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/>
    <title>title</title>
    <link href='xxx.css' rel='stylesheet'/>
 </head>
</html>
```

## Getting started:

JavaTags is hosted on [Maven Central](http://search.maven.org/). 
So you can add dependency to your pom.xml:

```xml
<dependency>
  <groupId>com.github.manliogit</groupId>
  <artifactId>javatags</artifactId>
  <version>0.3</version>
</dependency>
```

for other build tools, see [the central repository](http://search.maven.org/#artifactdetails%7Ccom.github.manliogit%7Cjavatags%7C0.3%7Cjar) 

## Examples


### simple:

Fragment like:
  
```java  
import static com.github.manliogit.javatags.lang.HtmlHelper.*;

html5(attr("lang -> en"),
  head(
    meta(attr("http-equiv -> Content-Type", "content -> text/html; charset=UTF-8")),
    title("title"),
    link(attr("href -> xxx.css", "rel -> stylesheet"))
  )
).render();
```

is rendered as:

```html
<!DOCTYPE html>
<html lang='en'>
  <head>
    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/>
    <title>title</title>
    <link href='xxx.css' rel='stylesheet'/>
  </head>
</html>
```

### bootstrap [Gentelella Theme](https://github.com/puikinsh/gentelella) :

Fragment like:

```java
html5(attr("lang -> en"),
    head(
        meta( attr("http-equiv -> Content-Type", "content -> text/html; charset=UTF-8")),
        meta( attr("http-equiv -> X-UA-Compatible", "content -> IE=edge")),
        meta( attr("name -> viewport", "content -> width=device-width, initial-scale=1")),
        title("Gentellela Alela!"),
        link( attr("href -> /css/bootstrap.css", "rel -> stylesheet")),
        link( attr("href -> /css/font-awesome.css", "rel -> stylesheet")),
        link( attr("href -> /css/nprogress.css", "rel -> stylesheet")),
        link( attr("href -> /css/custom.css", "rel -> stylesheet"))
    ),
    body( attr("class -> nav-md"),
      div( attr("class -> container body"),
        div( attr("class -> main_container"),
          div( attr("class -> col-md-3 left_col"),
            div( attr("class -> left_col scroll-view"),
              div( attr("class -> navbar nav_title", "style -> border: 0;"),
                a( attr("href -> xx", "class -> site_title"), i(attr("class -> fa fa-paw")), span("Gentellela Alela!"))
              ),
              div( attr("class -> clearfix")),
              //<!-- menu profile quick info -->
              div( attr("class -> profile"),
                div( attr("class -> profile_pic"),
                  img( attr("src -> /images/site/img.jpg", "alt -> ...", "class -> img-circle profile_img"))
                ),
                div( attr("class -> profile_info"),
                  span("Welcome,"),
                  h2("John Doe")
                )
              ),
              //<!-- /menu profile quick info -->
              br(),
              //<!-- sidebar menu -->
              div( attr("id -> sidebar-menu", "class -> main_menu_side hidden-print main_menu"),
                div( attr("class -> menu_section"),
                  h3("General"),
                  ul( attr("class -> nav side-menu"),
                    li(a(i(attr("class -> fa fa-home")), text("Home"), span(attr("class -> fa fa-chevron-down"))),
                      ul( attr("class -> nav child_menu"),
                        li( a( attr("href -> xx"),"Dashboard")),
                        li(a( attr("href -> xx"),"Dashboard2")),
                        li(a( attr("href -> xx"),"Dashboard3"))
                      )
                    ),
                    li(a(i(attr("class -> fa fa-edit")), text("Forms"), span(attr("class -> fa fa-chevron-down"))),
                      ul( attr("class -> nav child_menu"),
                        li(a( attr("href -> xx"),"General Form")),
                        li(a( attr("href -> xx"),"Advanced Components")),
                        li(a( attr("href -> xx"),"Form Validation")),
                        li(a( attr("href -> xx"),"Form Wizard")),
                        li(a( attr("href -> xx"),"Form Upload")),
                        li(a( attr("href -> xx"),"Form Buttons"))
                      )
                    )
                  )
                )
              ),
              //<!-- /sidebar menu -->
              //<!-- /menu footer buttons -->
              div( attr("class -> sidebar-footer hidden-small"),
                a( attr("data-toggle -> tooltip", "data-placement -> top", "title -> xxx", "data-original-title -> Settings"),
                  span( attr("class -> glyphicon glyphicon-cog", "aria-hidden -> true"))
                ),
                a( attr("data-toggle -> tooltip", "data-placement -> top", "title ->  xxx", "data-original-title -> FullScreen"),
                  span( attr("class -> glyphicon glyphicon-fullscreen", "aria-hidden -> true"))
                ),
                a( attr("data-toggle -> tooltip", "data-placement -> top", "title -> xx", "data-original-title -> Lock"),
                  span( attr("class -> glyphicon glyphicon-eye-close", "aria-hidden -> true"))
                ),
                a( attr("data-toggle -> tooltip", "data-placement -> top", "title -> xx", "data-original-title -> Logout"),
                  span( attr("class -> glyphicon glyphicon-off", "aria-hidden -> true"))
                )
              )
              //<!-- /menu footer buttons -->
            )
          ),
          //<!-- top navigation -->
          div( attr("class -> top_nav"),
            div( attr("class -> nav_menu"),
              nav(
                div( attr("class -> nav toggle"),
                  a( attr("id -> menu_toggle"),i( attr("class -> fa fa-bars")))
                ),
                ul( attr("class -> nav navbar-nav navbar-right"),
                  li( attr("class -> xx"),
                    a( attr("href -> javascript:;", "class -> user-profile dropdown-toggle", "data-toggle -> dropdown", "aria-expanded -> false"),
                      img( attr("src -> /images/site/img.jpg", "alt -> ...")), text("John Doe"),
                      span( attr("class ->  fa fa-angle-down"))
                    ),
                    ul( attr("class -> dropdown-menu dropdown-usermenu pull-right"),
                      li(a( attr("href -> javascript:;"), "Profile")),
                      li(
                        a( attr("href -> javascript:;"),
                          span( attr("class -> badge bg-red pull-right"),"50%"),
                          span("Settings")
                        )
                      ),
                      li(a( attr("href -> javascript:;"),"Help")),
                      li(a( attr("href -> xxx"),i(attr("class -> fa fa-sign-out pull-right")), text("Log Out"))))
                    )
                  )
                )
              )
            ),  
            div( attr("class -> right_col", "role -> main", "style -> min-height: 721px;"),
              div( attr("class -> xxx"),
                div( attr("class -> page-title"),
                  div( attr("class -> title_left"),
                    h3("Plain Page")
                  ),
                  div( attr("class -> title_right"),
                    div( attr("class -> col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search"),
                      div( attr("class -> input-group"),
                        input( attr("class -> form-control", "placeholder -> Search for...", "type -> text")),
                        span( attr("class -> input-group-btn"),
                          button( attr("class -> btn btn-default", "type -> button"), "Go!")
                        )
                      )
                    )
                  )
                ),
                div( attr("class -> clearfix")),
                div( attr("class -> row"),
                  div( attr("class -> col-md-12 col-sm-12 col-xs-12"),
                    div( attr("class -> x_panel"),
                      div( attr("class -> x_title"),
                        h2("Plain Page"),
                        ul( attr("class -> nav navbar-right panel_toolbox"),
                          li(a(attr("class -> collapse-link"),i( attr("class -> fa fa-chevron-up")))
                          ),
                          li( attr("class -> dropdown"),
                            a( attr("href -> #", "class -> dropdown-toggle", "data-toggle -> dropdown", "role -> button", "aria-expanded -> false"),i( attr("class -> fa fa-wrench"))),
                            ul( attr("class -> dropdown-menu", "role -> menu"),
                              li(a( attr("href -> #"),"Settings 1")
                              ),
                              li(a( attr("href -> #"), "Settings 2")
                              )
                            )
                          ),
                          li(a( attr("class -> close-link"),i( attr("class -> fa fa-close")))
                          )
                        ),
                        div( attr("class -> clearfix"))
                      ),
                      div( attr("class -> x_content"),
                          "Add content to the page ..."
                      )
                    )
                  )
                )
              )
            ),
            //<!-- /page content -->
            footer(
              div( attr("class -> pull-right"),
                text("Gentelella - Bootstrap Admin Template by "), 
                a(attr("href -> https://colorlib.com/"),  "Colorlib")
              ),
              div( attr("class -> clearfix"))
            )
          )
       ),
	   script( attr("src -> /js/jquery.js")),
	   script( attr("src -> /js/bootstrap.js")),
	   script( attr("src -> /js/fastclick.js")),
	   script( attr("src -> /js/nprogress.js")),
	   script( attr("src -> /js/custom.js"))
    )  
 ).render();
```


is rendered as:

```html
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <title>Gentellela Alela! | </title>
        <link href="plain_skel_files/bootstrap.css" rel="stylesheet"/>
        <link href="plain_skel_files/font-awesome.css" rel="stylesheet"/>
        <link href="plain_skel_files/nprogress.css" rel="stylesheet"/>
        <link href="plain_skel_files/custom.css" rel="stylesheet"/>
    </head>
    <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="" class="site_title"><i class="fa fa-paw"></i> <span>Gentellela Alela!</span></a>
            </div>
            <div class="clearfix"></div>
            <!-- menu profile quick info -->
            <div class="profile">
              <div class="profile_pic">
                <img src="plain_skel_files/img.jpg" alt="..." class="img-circle profile_img"/>
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>John Doe</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->
            <br>
            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="">Dashboard</a></li>
                      <li><a href="">Dashboard2</a></li>
                      <li><a href="">Dashboard3</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> Forms <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="">General Form</a></li>
                      <li><a href="">Advanced Components</a></li>
                      <li><a href="">Form Validation</a></li>
                      <li><a href="">Form Wizard</a></li>
                      <li><a href="">Form Upload</a></li>
                      <li><a href="">Form Buttons</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
            </div>
            <!-- /sidebar menu -->
            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="" data-original-title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="" data-original-title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="" data-original-title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="" data-original-title="Logout">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>
        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>
              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="plain_skel_files/img.jpg" alt=""/>John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href=""><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->
        <!-- page content -->
        <div class="right_col" role="main" style="min-height: 721px;">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Plain Page</h3>
              </div>
              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">
                    <input class="form-control" placeholder="Search for..." type="text">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                  </div>
                </div>
              </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Plain Page</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                      Add content to the page ...
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->
        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com/">Colorlib</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>
    <script src="plain_skel_files/jquery.js"></script>
    <script src="plain_skel_files/bootstrap.js"></script>
    <script src="plain_skel_files/fastclick.js"></script>
    <script src="plain_skel_files/nprogress.js"></script>
    <script src="plain_skel_files/custom.js"></script>
  </body>
</html>
```
 
## Notes:


if there is a missing tag you need, use `nonVoid` or `void` method for nonVoid, void element respectively: 

```java
nonVoid("some", attr("a -> b")).render()
```

renders to:

```xml
<some "a=b"></some>
```

while:

```java
voidEl("some", attr("a -> b")).render()
```

renders to:
	
```xml	
<some "a=b"/>
``` 



