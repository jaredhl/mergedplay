
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
object members extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[StudentMember],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(membersList: List[StudentMember]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title> """),_display_(/*4.18*/membersList/*4.29*/.size()),format.raw/*4.36*/(""" """),format.raw/*4.37*/("""members </title>
    </head>
"""),_display_(/*6.2*/for(member <- membersList) yield /*6.28*/{_display_(Seq[Any](format.raw/*6.29*/("""
    """),format.raw/*7.5*/("""<div class="gesture-item">
        <h2>"""),_display_(/*8.14*/member/*8.20*/.firstName),format.raw/*8.30*/("""</h2>
        <p>"""),_display_(/*9.13*/member/*9.19*/.major),format.raw/*9.25*/("""</p>
    </div>
""")))}),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""</html>"""))}
  }

  def render(membersList:List[StudentMember]): play.twirl.api.HtmlFormat.Appendable = apply(membersList)

  def f:((List[StudentMember]) => play.twirl.api.HtmlFormat.Appendable) = (membersList) => apply(membersList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 18 15:18:22 EST 2015
                  SOURCE: C:/Users/Jared/Documents/CampusY/mergedplay/app/views/members.scala.html
                  HASH: 0f65fa51b33f906fefce661e1f1ced7df86e7927
                  MATRIX: 738->1|860->35|888->37|951->74|970->85|997->92|1025->93|1082->125|1123->151|1161->152|1193->158|1260->199|1274->205|1304->215|1349->234|1363->240|1389->246|1438->265|1467->267
                  LINES: 26->1|29->1|30->2|32->4|32->4|32->4|32->4|34->6|34->6|34->6|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|40->12
                  -- GENERATED --
              */
          