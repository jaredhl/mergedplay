
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
object search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[StudentMember],play.data.Form[controllers.Search],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(membersList: List[StudentMember], searchForm: play.data.Form[controllers.Search]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.84*/(""" """),format.raw/*1.85*/("""<!--- gets rendered with a list from the database --->
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Search for a User</title>
      <!--<link rel="stylesheet" href="profile.css" />-->
    <script src="bower_components/webcomponentsjs/webcomponents-lite.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.at("stylesheets/material.min.css")),format.raw/*9.83*/(""""/>
    <script src="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
    <link rel="import" href="bower_components/paper-button/paper-button.html">
    <link rel="import" href="bower_components/paper-input/paper-input.html">

  </head>
  <body>
      <!-- Simple header with fixed tabs. -->
    <div class="mdl-layout mdl-js-layout mdl-layout--fixed-header
             mdl-layout--fixed-tabs">
      <header class="mdl-layout__header">
        <style>
        .mdl-layout__header-row """),format.raw/*22.33*/("""{"""),format.raw/*22.34*/("""
        """),format.raw/*23.9*/("""margin: auto;
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""</style>
        <div class="mdl-layout__header-row">
            <!-- Title -->
          <span class="mdl-layout-title">Search for a Campus Y User</span>
        </div>
          <!-- Tabs -->
        <div class="mdl-layout__tab-bar mdl-js-ripple-effect">
          <a href="#fixed-tab-1" class="mdl-layout__tab is-active">Search</a>
          <a href="#fixed-tab-2" class="mdl-layout__tab">About</a>
          <a href="#fixed-tab-3" class="mdl-layout__tab">Help</a>
        </div>
      </header>
        <!--<div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Title</span>
            </div>-->

      <main class="mdl-layout__content">
        <section class="mdl-layout__tab-panel is-active" id="fixed-tab-1">
          <style>
          .page-content """),format.raw/*44.25*/("""{"""),format.raw/*44.26*/("""
          """),format.raw/*45.11*/("""min-height: 100vh;
          //background-color: grey;
          """),format.raw/*47.11*/("""}"""),format.raw/*47.12*/("""
          """),format.raw/*48.11*/(""".mdl-textfield """),format.raw/*48.26*/("""{"""),format.raw/*48.27*/("""
          """),format.raw/*49.11*/("""margin-left: 10px;
          width: 95%;
          """),format.raw/*51.11*/("""}"""),format.raw/*51.12*/("""
          """),format.raw/*52.11*/(""".material-icons """),format.raw/*52.27*/("""{"""),format.raw/*52.28*/("""
          """),format.raw/*53.11*/("""font-size: 48px;
          """),format.raw/*54.11*/("""}"""),format.raw/*54.12*/("""

          """),format.raw/*56.11*/("""</style>
          <div class="page-content" style="background-image: url('"""),_display_(/*57.68*/routes/*57.74*/.Assets.at("images/Campus Y Background.jpg")),format.raw/*57.118*/("""'); background-size: cover; padding-bottom: 50px;">
              <!-- Wide card with share menu button -->
            <style>
            .demo-card-wide.mdl-card """),format.raw/*60.38*/("""{"""),format.raw/*60.39*/("""
            """),format.raw/*61.13*/("""width: 512px;
            """),format.raw/*62.13*/("""}"""),format.raw/*62.14*/("""
            """),format.raw/*63.13*/(""".demo-card-wide > .mdl-card__title """),format.raw/*63.48*/("""{"""),format.raw/*63.49*/("""
            """),format.raw/*64.13*/("""color: #fff;
            height: 176px;
            background: url('../assets/demos/welcome_card.jpg') center / cover;
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
            """),format.raw/*68.13*/(""".demo-card-wide > .mdl-card__menu """),format.raw/*68.47*/("""{"""),format.raw/*68.48*/("""
            """),format.raw/*69.13*/("""color: #fff;
            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/("""

            """),format.raw/*72.13*/("""</style>


            <div class="demo-card-wide mdl-card mdl-shadow--2dp" style="margin: auto">
              <div class="mdl-card__title">
                <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable
                                     mdl-textfield--floating-label">
                  """),_display_(/*79.20*/helper/*79.26*/.form(routes.Application.search())/*79.60*/{_display_(Seq[Any](format.raw/*79.61*/("""

                  """),format.raw/*81.19*/("""<!---button--->
                  <button type="submit" name="action" value="search">
                    <label class="mdl-button mdl-js-button mdl-button--icon" for="search-expandable2">
                      <i class="material-icons material-icons.md-dark" style="color: rgba(0, 0, 0, 0.54);">search</i>
                    </label>
                  </button>
                  <!---end button--->
                  <div class="mdl-textfield__expandable-holder">

                    <input name="query" class="mdl-textfield__input" type="String" id="search-expandable2" value=""""),_display_(/*90.116*/searchForm("query")/*90.135*/.value),format.raw/*90.141*/("""" style="position: absolute; bottom: 0; color: rgb(3, 169, 244); border-bottom-color: rgba(0,0,0,0); border-bottom: solid; border-bottom-color: rgb(3, 169, 244); font-size: 24px;">
                    <label class="mdl-textfield__label" for="search-expandable2">
                                            Search User
                    </label>
                  </div>


                  """)))}),format.raw/*97.20*/("""
                """),format.raw/*98.17*/("""</div>
              </div>
              <div class="mdl-card__supporting-text">
                                Search for a Campus Y member or Alumni.  You can also search by location, experience or other tags associated with users.
              </div>
            </div>







              <!-- Wide card with share menu button -->
            <style>
            .demo-card-wide.mdl-card """),format.raw/*113.38*/("""{"""),format.raw/*113.39*/("""
            """),format.raw/*114.13*/("""width: 512px;
            """),format.raw/*115.13*/("""}"""),format.raw/*115.14*/("""
            """),format.raw/*116.13*/(""".demo-card-wide > .mdl-card__title """),format.raw/*116.48*/("""{"""),format.raw/*116.49*/("""
            """),format.raw/*117.13*/("""color: #fff;
            height: 176px;
            //background: url('richard.jpg');
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/("""
            """),format.raw/*121.13*/(""".demo-card-wide > .mdl-card__menu """),format.raw/*121.47*/("""{"""),format.raw/*121.48*/("""
            """),format.raw/*122.13*/("""color: #fff;
            """),format.raw/*123.13*/("""}"""),format.raw/*123.14*/("""
            """),format.raw/*124.13*/("""</style>

            <!--- cards start here --->
            """),_display_(/*127.14*/for(member <- membersList) yield /*127.40*/{_display_(Seq[Any](format.raw/*127.41*/("""
              """),format.raw/*128.15*/("""<!---render a card for each returned result--->
              <!---whoe page gets re-rendered on each search--->
              <div class="demo-card-wide mdl-card mdl-shadow--2dp" style="margin: auto; margin-top: 20px;">
                <div class="mdl-card__title">
                  <style>
                  .mdl-card__title-text """),format.raw/*133.41*/("""{"""),format.raw/*133.42*/("""
                  """),format.raw/*134.19*/("""color: rgba(0, 0, 0, .54);
                  """),format.raw/*135.19*/("""}"""),format.raw/*135.20*/("""
                  """),format.raw/*136.19*/(""".mdl-card__title-text li """),format.raw/*136.44*/("""{"""),format.raw/*136.45*/("""
                  """),format.raw/*137.19*/("""font-size: 14px;
                  """),format.raw/*138.19*/("""}"""),format.raw/*138.20*/("""
                  """),format.raw/*139.19*/("""</style>
                  <img src=""""),_display_(/*140.30*/routes/*140.36*/.Assets.at("images/richard-2.jpg")),format.raw/*140.70*/("""" style='height: 144px; width: 144px;'>
                  <h2 class="mdl-card__title-text" style=' float: left; position: absolute; top: 16px; padding-left: 5px;> """),_display_(/*141.125*/member/*141.131*/.firstName),format.raw/*141.141*/(""" """),_display_(/*141.143*/member/*141.149*/.lastName),format.raw/*141.158*/("""</h2>
                  <ul class='mdl-card__title-text' style="padding-left: 5px; flex-direction: column; position: relative; top: 0;">
                    <li>"""),_display_(/*143.26*/member/*143.32*/.firstName),format.raw/*143.42*/("""</li>
                  </ul>
                </div>
                <div class="mdl-card__supporting-text">
                                I am an alumni of UNC and the current director of UNC Campus Y.  I have spent several years in Budapest and have extensive experience
                  leading social justice organizations in various other European countries.
                </div>
                <div class="mdl-card__actions mdl-card--border">
                  <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                                    Message Richard
                  </a>
                </div>
              </div>
            """)))}),format.raw/*156.14*/("""


            """),format.raw/*159.13*/("""<!--- old cards
            <div class="demo-card-wide mdl-card mdl-shadow--2dp" style="margin: auto; margin-top: 20px;">
              <div class="mdl-card__title">
                <style>
                .mdl-card__title-text """),format.raw/*163.39*/("""{"""),format.raw/*163.40*/("""
                """),format.raw/*164.17*/("""color: rgba(0, 0, 0, .54);
                """),format.raw/*165.17*/("""}"""),format.raw/*165.18*/("""
                """),format.raw/*166.17*/(""".mdl-card__title-text li """),format.raw/*166.42*/("""{"""),format.raw/*166.43*/("""
                """),format.raw/*167.17*/("""font-size: 14px;
                """),format.raw/*168.17*/("""}"""),format.raw/*168.18*/("""
                """),format.raw/*169.17*/("""</style>
                <img src=""""),_display_(/*170.28*/routes/*170.34*/.Assets.at("images/richard-2.jpg")),format.raw/*170.68*/("""" style='height: 144px; width: 144px;'>
                <h2 class="mdl-card__title-text" style=' float: left; position: absolute; top: 16px; padding-left: 5px;'>Richard Harrill</h2>
                <ul class='mdl-card__title-text' style="padding-left: 5px; flex-direction: column; position: relative; top: 0;">
                  <li> Columbia School of Social Work</li>
                  <li> Peace Corps</li>
                  <li> Demokratikus Ifjusagert Alapitvany </li>
                  <li> Hungary</li>
                  <li> UNC B.A.</li>
                  <li> UNC J.D.</li>
                </ul>
              </div>
              <div class="mdl-card__supporting-text">
                                I am an alumni of UNC and the current director of UNC Campus Y.  I have spent several years in Budapest and have extensive experience
                leading social justice organizations in various other European countries.
              </div>
              <div class="mdl-card__actions mdl-card--border">
                <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                                    Message Richard
                </a>
              </div>
            </div> --->


            <!--- old card
            <div class="demo-card-wide mdl-card mdl-shadow--2dp" style="margin: auto; margin-top: 20px;">
              <div class="mdl-card__title">
                <style>
                .mdl-card__title-text """),format.raw/*197.39*/("""{"""),format.raw/*197.40*/("""
                """),format.raw/*198.17*/("""color: rgba(0, 0, 0, .54);
                """),format.raw/*199.17*/("""}"""),format.raw/*199.18*/("""
                """),format.raw/*200.17*/(""".mdl-card__title-text li """),format.raw/*200.42*/("""{"""),format.raw/*200.43*/("""
                """),format.raw/*201.17*/("""font-size: 14px;
                """),format.raw/*202.17*/("""}"""),format.raw/*202.18*/("""
                """),format.raw/*203.17*/("""</style>
                <img src=""""),_display_(/*204.28*/routes/*204.34*/.Assets.at("images/Lauren-2.jpg")),format.raw/*204.67*/("""" style='height: 144px; width: 144px;'>
                <h2 class="mdl-card__title-text" style=' float: left; position: absolute; top: 16px; padding-left: 5px;'>Lauren Eaves</h2>
                <ul class='mdl-card__title-text' style="padding-left: 5px; flex-direction: column; position: relative; top: 0;">
                  <li> Bolivian Street Children Project</li>
                  <li> Bolivia</li>
                  <li> The Water Project</li>
                  <li> England</li>
                  <li> UNC B.A.</li>
                </ul>
              </div>
              <div class="mdl-card__supporting-text">
                                I graduated this year from UNC with a BA in Biology and am currently working with Campus Y on their student and alumni outreach efforts.
                After my experience working with the Bolivian Street Children Project, I have become interested in homelessness and water access issues in South America.
              </div>
              <div class="mdl-card__actions mdl-card--border">
                <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                                    Message Lauren
                </a>
              </div>
            </div> --->


          </div>
        </section>
        <section class="mdl-layout__tab-panel" id="fixed-tab-2">
          <div class="page-content"><!-- Your content goes here --></div>
        </section>
        <section class="mdl-layout__tab-panel" id="fixed-tab-3">
          <div class="page-content"><!-- Your content goes here --></div>
        </section>
      </main>
      <footer class="mdl-mini-footer" style="padding-top: 5px; padding-bottom: 5px;">
        <style>
        footer """),format.raw/*237.16*/("""{"""),format.raw/*237.17*/("""
        """),format.raw/*238.9*/("""float: right;
        """),format.raw/*239.9*/("""}"""),format.raw/*239.10*/("""
        """),format.raw/*240.9*/("""</style>
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
</html>
"""))}
  }

  def render(membersList:List[StudentMember],searchForm:play.data.Form[controllers.Search]): play.twirl.api.HtmlFormat.Appendable = apply(membersList,searchForm)

  def f:((List[StudentMember],play.data.Form[controllers.Search]) => play.twirl.api.HtmlFormat.Appendable) = (membersList,searchForm) => apply(membersList,searchForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 18 15:01:26 EST 2015
                  SOURCE: C:/Users/Jared/Documents/CampusY/mergedplay/app/views/search.scala.html
                  HASH: ccf004132d0f9bd5dd37d0b4a4b8c92c3f3b7ac8
                  MATRIX: 772->1|942->83|970->84|1381->469|1395->475|1457->517|2106->1138|2135->1139|2172->1149|2222->1172|2251->1173|2288->1183|3121->1988|3150->1989|3190->2001|3285->2068|3314->2069|3354->2081|3397->2096|3426->2097|3466->2109|3547->2162|3576->2163|3616->2175|3660->2191|3689->2192|3729->2204|3785->2232|3814->2233|3856->2247|3960->2324|3975->2330|4041->2374|4237->2542|4266->2543|4308->2557|4363->2584|4392->2585|4434->2599|4497->2634|4526->2635|4568->2649|4731->2784|4760->2785|4802->2799|4864->2833|4893->2834|4935->2848|4989->2874|5018->2875|5062->2891|5411->3213|5426->3219|5469->3253|5508->3254|5558->3276|6178->3868|6207->3887|6235->3893|6667->4294|6713->4312|7153->4723|7183->4724|7226->4738|7282->4765|7312->4766|7355->4780|7419->4815|7449->4816|7492->4830|7622->4931|7652->4932|7695->4946|7758->4980|7788->4981|7831->4995|7886->5021|7916->5022|7959->5036|8053->5102|8096->5128|8136->5129|8181->5145|8548->5483|8578->5484|8627->5504|8702->5550|8732->5551|8781->5571|8835->5596|8865->5597|8914->5617|8979->5653|9009->5654|9058->5674|9125->5713|9141->5719|9197->5753|9391->5918|9408->5924|9441->5934|9472->5936|9489->5942|9521->5951|9713->6115|9729->6121|9761->6131|10489->6827|10536->6845|10797->7077|10827->7078|10874->7096|10947->7140|10977->7141|11024->7159|11078->7184|11108->7185|11155->7203|11218->7237|11248->7238|11295->7256|11360->7293|11376->7299|11432->7333|12962->8834|12992->8835|13039->8853|13112->8897|13142->8898|13189->8916|13243->8941|13273->8942|13320->8960|13383->8994|13413->8995|13460->9013|13525->9050|13541->9056|13596->9089|15398->10862|15428->10863|15466->10873|15517->10896|15547->10897|15585->10907
                  LINES: 26->1|29->1|29->1|37->9|37->9|37->9|50->22|50->22|51->23|52->24|52->24|53->25|72->44|72->44|73->45|75->47|75->47|76->48|76->48|76->48|77->49|79->51|79->51|80->52|80->52|80->52|81->53|82->54|82->54|84->56|85->57|85->57|85->57|88->60|88->60|89->61|90->62|90->62|91->63|91->63|91->63|92->64|95->67|95->67|96->68|96->68|96->68|97->69|98->70|98->70|100->72|107->79|107->79|107->79|107->79|109->81|118->90|118->90|118->90|125->97|126->98|141->113|141->113|142->114|143->115|143->115|144->116|144->116|144->116|145->117|148->120|148->120|149->121|149->121|149->121|150->122|151->123|151->123|152->124|155->127|155->127|155->127|156->128|161->133|161->133|162->134|163->135|163->135|164->136|164->136|164->136|165->137|166->138|166->138|167->139|168->140|168->140|168->140|169->141|169->141|169->141|169->141|169->141|169->141|171->143|171->143|171->143|184->156|187->159|191->163|191->163|192->164|193->165|193->165|194->166|194->166|194->166|195->167|196->168|196->168|197->169|198->170|198->170|198->170|225->197|225->197|226->198|227->199|227->199|228->200|228->200|228->200|229->201|230->202|230->202|231->203|232->204|232->204|232->204|265->237|265->237|266->238|267->239|267->239|268->240
                  -- GENERATED --
              */
          