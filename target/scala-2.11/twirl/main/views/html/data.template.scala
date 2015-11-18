
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
import play.data.Form
/**/
object data extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.StudentMember],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(studentForm:Form[models.StudentMember]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.42*/("""
"""),_display_(/*4.2*/main("Data tests")/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
    """),_display_(/*5.6*/if(studentForm.value.isDefined)/*5.37*/{_display_(Seq[Any](format.raw/*5.38*/("""
        """),format.raw/*6.9*/("""<h1>"""),_display_(/*6.14*/studentForm/*6.25*/.get.firstName),format.raw/*6.39*/("""</h1>
        <h2>majors in """),_display_(/*7.24*/studentForm/*7.35*/.get.major),format.raw/*7.45*/("""</h2>
    """)))}/*8.7*/else/*8.12*/{_display_(Seq[Any](format.raw/*8.13*/("""
        """),format.raw/*9.9*/("""<h1>Feed some data</h1>
        """),_display_(/*10.10*/helper/*10.16*/.form(action = routes.Data.save())/*10.50*/{_display_(Seq[Any](format.raw/*10.51*/("""
            """),_display_(/*11.14*/helper/*11.20*/.inputText(studentForm("firstName"))),format.raw/*11.56*/("""
            """),_display_(/*12.14*/helper/*12.20*/.inputText(studentForm("lastName"))),format.raw/*12.55*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(studentForm("gradYear"))),format.raw/*13.55*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(studentForm("email"))),format.raw/*14.52*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(studentForm("password"))),format.raw/*15.55*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(studentForm("homeTown"))),format.raw/*16.55*/("""
            """),_display_(/*17.14*/helper/*17.20*/.inputText(studentForm("major"))),format.raw/*17.52*/("""
            """),_display_(/*18.14*/helper/*18.20*/.inputText(studentForm("secondMajor"))),format.raw/*18.58*/("""
            """),_display_(/*19.14*/helper/*19.20*/.inputText(studentForm("PID"))),format.raw/*19.50*/("""
            """),_display_(/*20.14*/helper/*20.20*/.inputRadioGroup(
                studentForm("classLevel"),
                options = Seq("Freshman"->"Freshman","Sophomore"->"Sophomore","Junior"->"Junior","Senior"->"Senior"),
                '_label -> "Year",
                '_error -> None
            )),format.raw/*25.14*/("""

            """),format.raw/*27.13*/("""<input type="submit" name="send" value="Feed"/>
        """)))}),format.raw/*28.10*/("""
    """)))}),format.raw/*29.6*/("""
""")))}))}
  }

  def render(studentForm:Form[models.StudentMember]): play.twirl.api.HtmlFormat.Appendable = apply(studentForm)

  def f:((Form[models.StudentMember]) => play.twirl.api.HtmlFormat.Appendable) = (studentForm) => apply(studentForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 18 15:18:22 EST 2015
                  SOURCE: C:/Users/Jared/Documents/CampusY/mergedplay/app/views/data.scala.html
                  HASH: 80d18803b59e7edf7f317bb809837655b3e14c87
                  MATRIX: 763->27|891->67|919->70|945->88|983->89|1015->96|1054->127|1092->128|1128->138|1159->143|1178->154|1212->168|1268->198|1287->209|1317->219|1346->232|1358->237|1396->238|1432->248|1493->282|1508->288|1551->322|1590->323|1632->338|1647->344|1704->380|1746->395|1761->401|1817->436|1859->451|1874->457|1930->492|1972->507|1987->513|2040->545|2082->560|2097->566|2153->601|2195->616|2210->622|2266->657|2308->672|2323->678|2376->710|2418->725|2433->731|2492->769|2534->784|2549->790|2600->820|2642->835|2657->841|2942->1105|2986->1121|3075->1179|3112->1186
                  LINES: 26->3|29->3|30->4|30->4|30->4|31->5|31->5|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|34->8|34->8|34->8|35->9|36->10|36->10|36->10|36->10|37->11|37->11|37->11|38->12|38->12|38->12|39->13|39->13|39->13|40->14|40->14|40->14|41->15|41->15|41->15|42->16|42->16|42->16|43->17|43->17|43->17|44->18|44->18|44->18|45->19|45->19|45->19|46->20|46->20|51->25|53->27|54->28|55->29
                  -- GENERATED --
              */
          