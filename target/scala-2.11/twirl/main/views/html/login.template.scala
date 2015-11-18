
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[controllers.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: play.data.Form[controllers.Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.48*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Y connect</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png")),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css")),format.raw/*7.111*/("""">
    </head>
    <body>
        <header>
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.Application.index()),format.raw/*11.49*/("""" id="logo"><span>Y</span>Connect</a>
            <dl id="user">
                <dt>User</dt>
                <dd>
                    <a href=""""),_display_(/*15.31*/routes/*15.37*/.Application.logout()),format.raw/*15.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
        """),_display_(/*19.10*/helper/*19.16*/.form(routes.Application.authenticate)/*19.54*/ {_display_(Seq[Any](format.raw/*19.56*/("""
            """),format.raw/*20.13*/("""<h1>Sign in</h1>
            """),_display_(/*21.14*/if(loginForm.hasGlobalErrors)/*21.43*/ {_display_(Seq[Any](format.raw/*21.45*/("""
                """),format.raw/*22.17*/("""<p class="error">
                """),_display_(/*23.18*/loginForm/*23.27*/.globalError.message),format.raw/*23.47*/("""
                """),format.raw/*24.17*/("""</p>
            """)))}),format.raw/*25.14*/("""
            """),_display_(/*26.14*/if(flash.contains("success"))/*26.43*/ {_display_(Seq[Any](format.raw/*26.45*/("""
                """),format.raw/*27.17*/("""<p class="success">
                """),_display_(/*28.18*/flash/*28.23*/.get("success")),format.raw/*28.38*/("""
                """),format.raw/*29.17*/("""</p>
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""<p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(/*32.78*/loginForm("email")/*32.96*/.value),format.raw/*32.102*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
        """)))}),format.raw/*40.10*/("""

    """),format.raw/*42.5*/("""</body>
</html>"""))}
  }

  def render(loginForm:play.data.Form[controllers.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((play.data.Form[controllers.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 18 15:01:25 EST 2015
                  SOURCE: C:/Users/Jared/Documents/CampusY/mergedplay/app/views/login.scala.html
                  HASH: 83130c7990445cf0b2510850177c53fef7e3391a
                  MATRIX: 750->3|884->49|912->51|1050->163|1064->169|1116->201|1215->274|1229->280|1285->315|1381->384|1396->390|1437->410|1614->560|1629->566|1671->587|1782->671|1797->677|1844->715|1884->717|1926->731|1984->762|2022->791|2062->793|2108->811|2171->847|2189->856|2230->876|2276->894|2326->913|2368->928|2406->957|2446->959|2492->977|2557->1015|2571->1020|2607->1035|2653->1053|2703->1072|2745->1086|2854->1168|2881->1186|2909->1192|3175->1427|3210->1435
                  LINES: 26->2|29->2|30->3|33->6|33->6|33->6|34->7|34->7|34->7|38->11|38->11|38->11|42->15|42->15|42->15|46->19|46->19|46->19|46->19|47->20|48->21|48->21|48->21|49->22|50->23|50->23|50->23|51->24|52->25|53->26|53->26|53->26|54->27|55->28|55->28|55->28|56->29|57->30|58->31|59->32|59->32|59->32|67->40|69->42
                  -- GENERATED --
              */
          