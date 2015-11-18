// @SOURCE:C:/Users/Jared/Documents/CampusY/mergedplay/conf/routes
// @HASH:04df1fe2fcc899b95640f2688370879a7b4e4492
// @DATE:Wed Nov 18 15:01:23 EST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Data_create1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("member/new"))))
private[this] lazy val controllers_Data_create1_invoker = createInvoker(
controllers.Data.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Data", "create", Nil,"GET", """""", Routes.prefix + """member/new"""))
        

// @LINE:9
private[this] lazy val controllers_Data_save2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("member"))))
private[this] lazy val controllers_Data_save2_invoker = createInvoker(
controllers.Data.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Data", "save", Nil,"POST", """""", Routes.prefix + """member"""))
        

// @LINE:13
private[this] lazy val controllers_Data_add3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
private[this] lazy val controllers_Data_add3_invoker = createInvoker(
controllers.Data.add(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Data", "add", Nil,"GET", """""", Routes.prefix + """add"""))
        

// @LINE:15
private[this] lazy val controllers_JDBC_page4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test/page"))))
private[this] lazy val controllers_JDBC_page4_invoker = createInvoker(
controllers.JDBC.page(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JDBC", "page", Nil,"GET", """""", Routes.prefix + """test/page"""))
        

// @LINE:16
private[this] lazy val controllers_JDBC_table5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test/create"))))
private[this] lazy val controllers_JDBC_table5_invoker = createInvoker(
controllers.JDBC.table(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JDBC", "table", Nil,"GET", """""", Routes.prefix + """test/create"""))
        

// @LINE:17
private[this] lazy val controllers_JDBC_test6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test/"),DynamicPart("value", """[^/]+""",true))))
private[this] lazy val controllers_JDBC_test6_invoker = createInvoker(
controllers.JDBC.test(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JDBC", "test", Seq(classOf[String]),"GET", """""", Routes.prefix + """test/$value<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_Application_login7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login7_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:20
private[this] lazy val controllers_Application_authenticate8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_authenticate8_invoker = createInvoker(
controllers.Application.authenticate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:22
private[this] lazy val controllers_Application_allUsers9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("members"))))
private[this] lazy val controllers_Application_allUsers9_invoker = createInvoker(
controllers.Application.allUsers(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "allUsers", Nil,"GET", """""", Routes.prefix + """members"""))
        

// @LINE:24
private[this] lazy val controllers_Application_logout10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout10_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:26
private[this] lazy val controllers_Application_profile11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
private[this] lazy val controllers_Application_profile11_invoker = createInvoker(
controllers.Application.profile(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
        

// @LINE:27
private[this] lazy val controllers_Application_search12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_Application_search12_invoker = createInvoker(
controllers.Application.search(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Nil,"GET", """""", Routes.prefix + """search"""))
        

// @LINE:29
private[this] lazy val controllers_Assets_at13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """member/new""","""controllers.Data.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """member""","""controllers.Data.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Data.add()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test/page""","""controllers.JDBC.page()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test/create""","""controllers.JDBC.table()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test/$value<[^/]+>""","""controllers.JDBC.test(value:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """members""","""controllers.Application.allUsers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:8
case controllers_Data_create1_route(params) => {
   call { 
        controllers_Data_create1_invoker.call(controllers.Data.create())
   }
}
        

// @LINE:9
case controllers_Data_save2_route(params) => {
   call { 
        controllers_Data_save2_invoker.call(controllers.Data.save())
   }
}
        

// @LINE:13
case controllers_Data_add3_route(params) => {
   call { 
        controllers_Data_add3_invoker.call(controllers.Data.add())
   }
}
        

// @LINE:15
case controllers_JDBC_page4_route(params) => {
   call { 
        controllers_JDBC_page4_invoker.call(controllers.JDBC.page())
   }
}
        

// @LINE:16
case controllers_JDBC_table5_route(params) => {
   call { 
        controllers_JDBC_table5_invoker.call(controllers.JDBC.table())
   }
}
        

// @LINE:17
case controllers_JDBC_test6_route(params) => {
   call(params.fromPath[String]("value", None)) { (value) =>
        controllers_JDBC_test6_invoker.call(controllers.JDBC.test(value))
   }
}
        

// @LINE:19
case controllers_Application_login7_route(params) => {
   call { 
        controllers_Application_login7_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:20
case controllers_Application_authenticate8_route(params) => {
   call { 
        controllers_Application_authenticate8_invoker.call(controllers.Application.authenticate())
   }
}
        

// @LINE:22
case controllers_Application_allUsers9_route(params) => {
   call { 
        controllers_Application_allUsers9_invoker.call(controllers.Application.allUsers())
   }
}
        

// @LINE:24
case controllers_Application_logout10_route(params) => {
   call { 
        controllers_Application_logout10_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:26
case controllers_Application_profile11_route(params) => {
   call { 
        controllers_Application_profile11_invoker.call(controllers.Application.profile())
   }
}
        

// @LINE:27
case controllers_Application_search12_route(params) => {
   call { 
        controllers_Application_search12_invoker.call(controllers.Application.search())
   }
}
        

// @LINE:29
case controllers_Assets_at13_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     