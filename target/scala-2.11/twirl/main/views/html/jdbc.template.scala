
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
object jdbc extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/main("jdbc test")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<script>
        //JS makes ajax call
        $(function()"""),format.raw/*5.21*/("""{"""),format.raw/*5.22*/("""
        """),format.raw/*6.9*/("""}"""),format.raw/*6.10*/(""");
    </script>
    <style>
    ol li"""),format.raw/*9.10*/("""{"""),format.raw/*9.11*/("""
        """),format.raw/*10.9*/("""display:none;
        list-style:none;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""ol li:first-child """),format.raw/*13.23*/("""{"""),format.raw/*13.24*/("""
        """),format.raw/*14.9*/("""display:block;
    """),format.raw/*15.5*/("""}"""),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""</style>
    <ol id="jdbcresult">
        <li><a href=""""),_display_(/*18.23*/routes/*18.29*/.JDBC.table),format.raw/*18.40*/("""">Create table</a></li>
        <li><a href=""""),_display_(/*19.23*/routes/*19.29*/.JDBC.test("don't insert me")),format.raw/*19.58*/("""">first val</a></li>
        <li><a href=""""),_display_(/*20.23*/routes/*20.29*/.JDBC.test("what did I say?")),format.raw/*20.58*/("""">second val</a></li>
        <li><a href=""""),_display_(/*21.23*/routes/*21.29*/.JDBC.test("Grrr")),format.raw/*21.47*/("""">third val</a></li>
    </ol>
    <ul i="result">
    </ul>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 18 15:01:25 EST 2015
                  SOURCE: C:/Users/Jared/Documents/CampusY/mergedplay/app/views/jdbc.scala.html
                  HASH: 3fea761fa1abeeee64f5327f3e4943d4ae225206
                  MATRIX: 715->1|804->3|832->6|857->23|896->25|928->31|1015->91|1043->92|1079->102|1107->103|1175->144|1203->145|1240->155|1312->200|1340->201|1373->207|1419->225|1448->226|1485->236|1532->256|1560->257|1593->263|1678->321|1693->327|1725->338|1799->385|1814->391|1864->420|1935->464|1950->470|2000->499|2072->544|2087->550|2126->568
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|34->6|34->6|37->9|37->9|38->10|40->12|40->12|41->13|41->13|41->13|42->14|43->15|43->15|44->16|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21
                  -- GENERATED --
              */
          