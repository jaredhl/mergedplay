
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
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Campus Y User</title>
    <!--<link rel="stylesheet" href="profile.css" />-->
    <script src="bower_components/webcomponentsjs/webcomponents-lite.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.at("stylesheets/material.min.css")),format.raw/*10.83*/(""""/>
    <script src="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
    <link rel="import" href="bower_components/paper-button/paper-button.html">
    <link rel="import" href="bower_components/paper-input/paper-input.html">
</head>

<body>
<!-- The drawer is always open in large screens. The header is always shown,
  even in small screens. -->
<style>
    body  """),format.raw/*21.11*/("""{"""),format.raw/*21.12*/("""
        """),format.raw/*22.9*/("""background-image: url(""""),_display_(/*22.33*/routes/*22.39*/.Assets.at("images/Campus Y Background.jpg")),format.raw/*22.83*/("""");
        background-size: cover;
    """),format.raw/*24.5*/("""}"""),format.raw/*24.6*/("""
"""),format.raw/*25.1*/("""</style>

<div class="mdl-layout mdl-js-layout mdl-layout--fixed-drawer
             mdl-layout--fixed-header">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">
            <div class="mdl-layout-spacer"></div>
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable
                         mdl-textfield--floating-label mdl-textfield--align-right">
                <label class="mdl-button mdl-js-button mdl-button--icon"
                       for="fixed-header-drawer-exp">
                    <i class="material-icons">search</i>
                </label>
                <div class="mdl-textfield__expandable-holder">
                    <input class="mdl-textfield__input" type="text" name="sample"
                           id="fixed-header-drawer-exp">
                </div>
            </div>
        </div>
    </header>
    <div class="mdl-layout__drawer">
        <span class="mdl-layout-title">Profile Options</span>
        <nav class="mdl-navigation">
            <a class="mdl-navigation__link" href="">Edit Profile</a>
            <a class="mdl-navigation__link" href="">Manage Resume</a>
            <a class="mdl-navigation__link" href="">Favorites</a>
            <a class="mdl-navigation__link" href="">Messages</a>
        </nav>
    </div>
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Wide card with share menu button -->
            <style>
                .demo-card-wide.mdl-card """),format.raw/*58.42*/("""{"""),format.raw/*58.43*/("""
                    """),format.raw/*59.21*/("""width: 512px;
                    margin: 0 auto;
                """),format.raw/*61.17*/("""}"""),format.raw/*61.18*/("""
                """),format.raw/*62.17*/(""".demo-card-wide > .mdl-card__title """),format.raw/*62.52*/("""{"""),format.raw/*62.53*/("""
                    """),format.raw/*63.21*/("""color:  #fff;
                    height: 176px;
                    background-color: rgb(3, 169, 244);
                //background: url('../assets/demos/welcome_card.jpg') center / cover;
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/("""
                """),format.raw/*68.17*/(""".demo-card-wide > .mdl-card__title ul """),format.raw/*68.55*/("""{"""),format.raw/*68.56*/("""
                    """),format.raw/*69.21*/("""list-style-type: none;
                    columns: 2;
                """),format.raw/*71.17*/("""}"""),format.raw/*71.18*/("""
                """),format.raw/*72.17*/(""".demo-card-wide > .mdl-card__menu """),format.raw/*72.51*/("""{"""),format.raw/*72.52*/("""
                    """),format.raw/*73.21*/("""color: #fff;
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""
                """),format.raw/*75.17*/(""".demo-card-wide mdl-card__supporting-text """),format.raw/*75.59*/("""{"""),format.raw/*75.60*/("""
                    """),format.raw/*76.21*/("""color: #fff;
                    font-size: 8px;
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/("""
            """),format.raw/*79.13*/("""</style>

            <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                <div class="mdl-card__title">
                    <img class="mdl-card__title" src=""""),_display_(/*83.56*/routes/*83.62*/.Assets.at("images/defaultUserPic.png")),format.raw/*83.101*/("""" alt="Default User Pic">
                    <ul>
                        <li><span class="mdl-badge" data-badge="7"></span>Spanish</li>
                        <li><span class="mdl-badge" data-badge="5"></span>Southeast Asia</li>
                        <li><span class="mdl-badge" data-badge="2"></span>Indonesia</li>
                        <li><span class="mdl-badge" data-badge="2"></span>Amnesty International</li>
                    </ul>
                    <!--<h2 class="mdl-card__title-text">Welcome</h2>-->
                </div>
                <div class="mdl-card__supporting-text">
                    <span id="PersonalInfoText">
                    <p>53 Banim Street<br>London<br>W60DN<br>United Kingdom<br>Birthday: 11/13/1978</p>
                    </span>
                            <span id="ProfessionalInfo">
                                <p>DHL<br>Sustainability Director<br>Ocean House, The Ring<br>Brackenell<br>England<br>RG121AN<br>United Kingdom</p>
                            </span>
                </div>
                <div class="mdl-card__actions mdl-card--border">
                    <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                        Message
                    </a>
                </div>
                <div class="mdl-card__menu">
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons">share</i>
                    </button>
                </div>
            </div>
            <!-- Your content goes here -->
        </div>
    </main>
    <footer class="mdl-mini-footer" style="padding-top: 5px; padding-bottom: 5px;">
        <style>
            footer """),format.raw/*116.20*/("""{"""),format.raw/*116.21*/("""
                """),format.raw/*117.17*/("""float: right;
            """),format.raw/*118.13*/("""}"""),format.raw/*118.14*/("""
        """),format.raw/*119.9*/("""</style>
        <div class="mdl-mini-footer__left-section">
            <div class="mdl-logo">Title</div>
            <ul class="mdl-mini-footer__link-list">
                <li><a href="#">Help</a></li>
                <li><a href="#">Privacy & Terms</a></li>
            </ul>
        </div>
    </footer>
</div>

</body>

</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 18 15:01:25 EST 2015
                  SOURCE: C:/Users/Jared/Documents/CampusY/mergedplay/app/views/profile.scala.html
                  HASH: 142d1a27f89cf228fb098e8b12e3c7f914394d14
                  MATRIX: 800->4|1148->325|1163->331|1226->373|1753->872|1782->873|1819->883|1870->907|1885->913|1950->957|2019->999|2047->1000|2076->1002|3652->2550|3681->2551|3731->2573|3827->2641|3856->2642|3902->2660|3965->2695|3994->2696|4044->2718|4283->2929|4312->2930|4358->2948|4424->2986|4453->2987|4503->3009|4604->3082|4633->3083|4679->3101|4741->3135|4770->3136|4820->3158|4878->3188|4907->3189|4953->3207|5023->3249|5052->3250|5102->3272|5197->3339|5226->3340|5268->3354|5476->3535|5491->3541|5552->3580|7370->5369|7400->5370|7447->5388|7503->5415|7533->5416|7571->5426
                  LINES: 29->3|36->10|36->10|36->10|47->21|47->21|48->22|48->22|48->22|48->22|50->24|50->24|51->25|84->58|84->58|85->59|87->61|87->61|88->62|88->62|88->62|89->63|93->67|93->67|94->68|94->68|94->68|95->69|97->71|97->71|98->72|98->72|98->72|99->73|100->74|100->74|101->75|101->75|101->75|102->76|104->78|104->78|105->79|109->83|109->83|109->83|142->116|142->116|143->117|144->118|144->118|145->119
                  -- GENERATED --
              */
          