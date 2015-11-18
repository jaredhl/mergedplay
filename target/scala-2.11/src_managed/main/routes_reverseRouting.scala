// @SOURCE:C:/Users/Jared/Documents/CampusY/mergedplay/conf/routes
// @HASH:04df1fe2fcc899b95640f2688370879a7b4e4492
// @DATE:Wed Nov 18 15:01:23 EST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:13
// @LINE:9
// @LINE:8
class ReverseData {


// @LINE:9
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "member")
}
                        

// @LINE:8
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "member/new")
}
                        

// @LINE:13
def add(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "add")
}
                        

}
                          

// @LINE:29
class ReverseAssets {


// @LINE:29
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseJDBC {


// @LINE:16
def table(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test/create")
}
                        

// @LINE:17
def test(value:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test/" + implicitly[PathBindable[String]].unbind("value", dynamicString(value)))
}
                        

// @LINE:15
def page(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test/page")
}
                        

}
                          

// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:26
def profile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                        

// @LINE:24
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:27
def search(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:22
def allUsers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "members")
}
                        

// @LINE:20
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:19
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:13
// @LINE:9
// @LINE:8
class ReverseData {


// @LINE:9
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Data.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "member"})
      }
   """
)
                        

// @LINE:8
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Data.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member/new"})
      }
   """
)
                        

// @LINE:13
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Data.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

}
              

// @LINE:29
class ReverseAssets {


// @LINE:29
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseJDBC {


// @LINE:16
def table : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JDBC.table",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test/create"})
      }
   """
)
                        

// @LINE:17
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JDBC.test",
   """
      function(value) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("value", encodeURIComponent(value))})
      }
   """
)
                        

// @LINE:15
def page : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JDBC.page",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test/page"})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:26
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:24
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:27
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:22
def allUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.allUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "members"})
      }
   """
)
                        

// @LINE:20
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:19
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:13
// @LINE:9
// @LINE:8
class ReverseData {


// @LINE:9
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Data.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Data", "save", Seq(), "POST", """""", _prefix + """member""")
)
                      

// @LINE:8
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Data.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Data", "create", Seq(), "GET", """""", _prefix + """member/new""")
)
                      

// @LINE:13
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Data.add(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Data", "add", Seq(), "GET", """""", _prefix + """add""")
)
                      

}
                          

// @LINE:29
class ReverseAssets {


// @LINE:29
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseJDBC {


// @LINE:16
def table(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JDBC.table(), HandlerDef(this.getClass.getClassLoader, "", "controllers.JDBC", "table", Seq(), "GET", """""", _prefix + """test/create""")
)
                      

// @LINE:17
def test(value:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JDBC.test(value), HandlerDef(this.getClass.getClassLoader, "", "controllers.JDBC", "test", Seq(classOf[String]), "GET", """""", _prefix + """test/$value<[^/]+>""")
)
                      

// @LINE:15
def page(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JDBC.page(), HandlerDef(this.getClass.getClassLoader, "", "controllers.JDBC", "page", Seq(), "GET", """""", _prefix + """test/page""")
)
                      

}
                          

// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:26
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:24
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:27
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Seq(), "GET", """""", _prefix + """search""")
)
                      

// @LINE:22
def allUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.allUsers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "allUsers", Seq(), "GET", """""", _prefix + """members""")
)
                      

// @LINE:20
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:19
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          
}
        
    