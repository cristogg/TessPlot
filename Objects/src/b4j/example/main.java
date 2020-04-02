package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 580, 740);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _panelmain = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static float[][] _mag2 = null;
public static int _ancho = 0;
public static int _alto = 0;
public static anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _bshowfiles = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lpiepag = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _bsavebmp = null;
public static anywheresoftware.b4a.objects.B4XCanvas _grafica = null;
public static String _latlongsl = "";
public static String _fentrada = "";
public static int _difacimut = 0;
public static anywheresoftware.b4j.objects.SliderWrapper _sbrillo = null;
public static String _fichsel = "";
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static float _brillomax = 0f;
public static float _brillomin = 0f;
public static float _mvmin = 0f;
public static float _mvmax = 0f;
public static float _rango = 0f;
public static anywheresoftware.b4j.objects.SliderWrapper _smvmax = null;
public static anywheresoftware.b4j.objects.SliderWrapper _smvmin = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lmvmin = null;
public static anywheresoftware.b4a.objects.B4XCanvas _can = null;
public static float[] _magas = null;
public static boolean _as145 = false;
public static anywheresoftware.b4j.objects.LabelWrapper _lmvmax = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _cbauto = null;
public static int[] _mr = null;
public static int[] _mg = null;
public static int[] _mb = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _cbcolor = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lcontras = null;
public static String _lati = "";
public static String _longi = "";
public static String _horasl = "";
public static float _tempirmin = 0f;
public static float _tempamb = 0f;
public static anywheresoftware.b4j.objects.CheckboxWrapper _cbtemper = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _cbtextobrillo = null;
public static int _numrowreal = 0;
public static anywheresoftware.b4j.objects.ButtonWrapper _bmas = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _bmenos = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _bmmenos = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _bmmas = null;
public static String  _abrirfile(String _nombre) throws Exception{
float _sealev = 0f;
float _altura = 0f;
float _alturaold = 0f;
float _acimut = 0f;
float _acimutold = 0f;
String _fsalida = "";
int _espera = 0;
int _numrow = 0;
int _nuevarow = 0;
int _nc = 0;
int _numlinea = 0;
String _strsalida = "";
String _strlinea = "";
anywheresoftware.b4a.objects.collections.List _head = null;
String _contenido = "";
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _row = null;
String _corto = "";
 //BA.debugLineNum = 783;BA.debugLine="Sub abrirfile (Nombre As String)  ' Abre fichero r";
 //BA.debugLineNum = 785;BA.debugLine="Private sealev As Float";
_sealev = 0f;
 //BA.debugLineNum = 786;BA.debugLine="Private altura, alturaold As Float";
_altura = 0f;
_alturaold = 0f;
 //BA.debugLineNum = 787;BA.debugLine="Private acimut, acimutold As Float";
_acimut = 0f;
_acimutold = 0f;
 //BA.debugLineNum = 790;BA.debugLine="Private fsalida As String";
_fsalida = "";
 //BA.debugLineNum = 792;BA.debugLine="Private espera, numrow, nuevarow, nc, numlinea As";
_espera = 0;
_numrow = 0;
_nuevarow = 0;
_nc = 0;
_numlinea = 0;
 //BA.debugLineNum = 793;BA.debugLine="Private strsalida, strlinea As String";
_strsalida = "";
_strlinea = "";
 //BA.debugLineNum = 794;BA.debugLine="Private head As List";
_head = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 795;BA.debugLine="Private contenido As String";
_contenido = "";
 //BA.debugLineNum = 797;BA.debugLine="fentrada = Nombre";
_fentrada = _nombre;
 //BA.debugLineNum = 798;BA.debugLine="fsalida = \"sel.txt\"";
_fsalida = "sel.txt";
 //BA.debugLineNum = 800;BA.debugLine="If File.Exists(File.DirApp,fentrada) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fentrada)) { 
 //BA.debugLineNum = 801;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 802;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 804;BA.debugLine="If File.Exists(File.DirApp, fsalida) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fsalida)) { 
 //BA.debugLineNum = 805;BA.debugLine="File.Delete(File.DirApp, fsalida)";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fsalida);
 };
 //BA.debugLineNum = 808;BA.debugLine="strsalida = \"\"";
_strsalida = "";
 //BA.debugLineNum = 809;BA.debugLine="contenido = File.ReadString(File.DirApp,fentrada";
_contenido = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fentrada);
 //BA.debugLineNum = 811;BA.debugLine="If contenido.IndexOf(\"#\") = 0 Then";
if (_contenido.indexOf("#")==0) { 
 //BA.debugLineNum = 812;BA.debugLine="If contenido.LastIndexOf(\"#\") > 0 Then";
if (_contenido.lastIndexOf("#")>0) { 
 //BA.debugLineNum = 814;BA.debugLine="Lpiepag.Text = \"Multiple starting simbol #\"";
_lpiepag.setText("Multiple starting simbol #");
 //BA.debugLineNum = 816;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 818;BA.debugLine="Table = su.LoadCSV2( File.DirApp,fentrada, Chr(";
_table = _su.LoadCSV2(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fentrada,anywheresoftware.b4a.keywords.Common.Chr((int) (9)),_head);
 //BA.debugLineNum = 825;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 826;BA.debugLine="MVmin = 100";
_mvmin = (float) (100);
 //BA.debugLineNum = 827;BA.debugLine="MVmax = 0";
_mvmax = (float) (0);
 }else {
 //BA.debugLineNum = 829;BA.debugLine="MVmin = 0";
_mvmin = (float) (0);
 //BA.debugLineNum = 830;BA.debugLine="MVmax = -100";
_mvmax = (float) (-100);
 };
 //BA.debugLineNum = 832;BA.debugLine="TempIRmin = 100";
_tempirmin = (float) (100);
 //BA.debugLineNum = 835;BA.debugLine="For Each Row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group33 = _table;
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_row = (String[])(group33.Get(index33));
 //BA.debugLineNum = 836;BA.debugLine="numrow = numrow + 1";
_numrow = (int) (_numrow+1);
 //BA.debugLineNum = 840;BA.debugLine="altura = Row(7)";
_altura = (float)(Double.parseDouble(_row[(int) (7)]));
 //BA.debugLineNum = 841;BA.debugLine="acimut = Row(8)";
_acimut = (float)(Double.parseDouble(_row[(int) (8)]));
 //BA.debugLineNum = 844;BA.debugLine="caldifacimut( acimut, acimutold)";
_caldifacimut((int) (_acimut),(int) (_acimutold));
 //BA.debugLineNum = 846;BA.debugLine="If (altura > alturaold + 3) Or (altura < altur";
if ((_altura>_alturaold+3) || (_altura<_alturaold-3) || (_difacimut>14)) { 
 //BA.debugLineNum = 847;BA.debugLine="espera = espera + 1";
_espera = (int) (_espera+1);
 //BA.debugLineNum = 848;BA.debugLine="If espera > 4 Then";
if (_espera>4) { 
 //BA.debugLineNum = 849;BA.debugLine="espera = 0";
_espera = (int) (0);
 //BA.debugLineNum = 850;BA.debugLine="nuevarow = nuevarow + 1";
_nuevarow = (int) (_nuevarow+1);
 //BA.debugLineNum = 851;BA.debugLine="alturaold = altura";
_alturaold = _altura;
 //BA.debugLineNum = 852;BA.debugLine="acimutold = acimut";
_acimutold = _acimut;
 //BA.debugLineNum = 854;BA.debugLine="If nuevarow < 49 Then";
if (_nuevarow<49) { 
 //BA.debugLineNum = 857;BA.debugLine="Private corto As String";
_corto = "";
 //BA.debugLineNum = 858;BA.debugLine="corto = Row(10).SubString2(0, Row(10).Index";
_corto = _row[(int) (10)].substring((int) (0),(int) (_row[(int) (10)].indexOf(",")+2));
 //BA.debugLineNum = 859;BA.debugLine="LatLongSl =  \"  \" & Row(2) & \"    Lat: \" &";
_latlongsl = "  "+_row[(int) (2)]+"    Lat: "+_row[(int) (9)].substring((int) (0),(int) (_row[(int) (9)].indexOf(",")+2))+"  Lon: "+_corto;
 //BA.debugLineNum = 861;BA.debugLine="Lati = \" Lat: \" & Row(9).SubString2(0, Row(";
_lati = " Lat: "+_row[(int) (9)].substring((int) (0),(int) (_row[(int) (9)].indexOf(",")+2));
 //BA.debugLineNum = 863;BA.debugLine="If (Row(3) < TempIRmin) Then";
if (((double)(Double.parseDouble(_row[(int) (3)]))<_tempirmin)) { 
 //BA.debugLineNum = 864;BA.debugLine="TempIRmin = Row(3)";
_tempirmin = (float)(Double.parseDouble(_row[(int) (3)]));
 //BA.debugLineNum = 865;BA.debugLine="TempAmb = Row(4)";
_tempamb = (float)(Double.parseDouble(_row[(int) (4)]));
 };
 //BA.debugLineNum = 868;BA.debugLine="Try";
try { //BA.debugLineNum = 870;BA.debugLine="sealev = Row(11) 'cuando no hay GPS parece";
_sealev = (float)(Double.parseDouble(_row[(int) (11)]));
 } 
       catch (Exception e57) {
			ba.setLastException(e57); //BA.debugLineNum = 873;BA.debugLine="sealev = 0";
_sealev = (float) (0);
 };
 //BA.debugLineNum = 876;BA.debugLine="LatLongSl = LatLongSl  & \"   SL: \" & sealev";
_latlongsl = _latlongsl+"   SL: "+BA.NumberToString(_sealev);
 //BA.debugLineNum = 877;BA.debugLine="For nc = 0 To Row.Length-1";
{
final int step60 = 1;
final int limit60 = (int) (_row.length-1);
_nc = (int) (0) ;
for (;_nc <= limit60 ;_nc = _nc + step60 ) {
 //BA.debugLineNum = 878;BA.debugLine="strsalida = strsalida  & Row(nc)	& \"	\"";
_strsalida = _strsalida+_row[_nc]+"	";
 //BA.debugLineNum = 879;BA.debugLine="strlinea = strlinea  & Row(nc)	& \"	\"";
_strlinea = _strlinea+_row[_nc]+"	";
 }
};
 //BA.debugLineNum = 882;BA.debugLine="If nuevarow < 48 Then";
if (_nuevarow<48) { 
 //BA.debugLineNum = 883;BA.debugLine="strsalida = strsalida & CRLF";
_strsalida = _strsalida+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 884;BA.debugLine="strlinea = strlinea & CRLF";
_strlinea = _strlinea+anywheresoftware.b4a.keywords.Common.CRLF;
 };
 };
 };
 };
 }
};
 //BA.debugLineNum = 893;BA.debugLine="If nuevarow > 47 Then";
if (_nuevarow>47) { 
 //BA.debugLineNum = 894;BA.debugLine="Try";
try { //BA.debugLineNum = 895;BA.debugLine="sealev = Row(11) 'cuando no hay GPS parece fa";
_sealev = (float)(Double.parseDouble(_row[(int) (11)]));
 } 
       catch (Exception e76) {
			ba.setLastException(e76); //BA.debugLineNum = 898;BA.debugLine="sealev = 0";
_sealev = (float) (0);
 };
 //BA.debugLineNum = 902;BA.debugLine="Lpiepag.Text = \"OK file. Total rows found: \" &";
_lpiepag.setText("OK file. Total rows found: "+BA.NumberToString(_numrow)+" Max:"+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmax,(int) (1)))+" Min:"+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmin,(int) (1))));
 //BA.debugLineNum = 903;BA.debugLine="File.WriteString(File.DirApp, fsalida, strsali";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fsalida,_strsalida);
 //BA.debugLineNum = 904;BA.debugLine="Lmvmax.Text = Round2( MVmax,1)";
_lmvmax.setText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmax,(int) (1))));
 //BA.debugLineNum = 905;BA.debugLine="Lmvmin.Text = Round2( MVmin,1)";
_lmvmin.setText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmin,(int) (1))));
 }else {
 //BA.debugLineNum = 907;BA.debugLine="Lpiepag.Text = \"Error. Total rows < 48: \" & nu";
_lpiepag.setText("Error. Total rows < 48: "+BA.NumberToString(_nuevarow));
 };
 }else {
 //BA.debugLineNum = 913;BA.debugLine="Lpiepag.Text = \"Starting simbol # not found.\"";
_lpiepag.setText("Starting simbol # not found.");
 };
 }else {
 //BA.debugLineNum = 918;BA.debugLine="Lpiepag.Text =  fentrada & \"  not found. \"";
_lpiepag.setText(_fentrada+"  not found. ");
 };
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return "";
}
public static String  _abrirfile145(String _nombre) throws Exception{
float _altura = 0f;
float _alturaold = 0f;
float _acimut = 0f;
float _acimutold = 0f;
String _fsalida = "";
int _espera = 0;
int _numrow = 0;
int _anterow = 0;
int _nuevarow = 0;
int _nc = 0;
int _recuperada = 0;
String _strsalida = "";
String _strlinea = "";
anywheresoftware.b4a.objects.collections.List _head = null;
String _contenido = "";
float _sealev = 0f;
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _row = null;
String _corto = "";
 //BA.debugLineNum = 619;BA.debugLine="Sub abrirfile145 (Nombre As String)  ' Abre ficher";
 //BA.debugLineNum = 622;BA.debugLine="Private altura, alturaold As Float";
_altura = 0f;
_alturaold = 0f;
 //BA.debugLineNum = 623;BA.debugLine="Private acimut, acimutold As Float";
_acimut = 0f;
_acimutold = 0f;
 //BA.debugLineNum = 625;BA.debugLine="Private fsalida As String";
_fsalida = "";
 //BA.debugLineNum = 627;BA.debugLine="Private espera, numrow, anterow, nuevarow, nc, re";
_espera = 0;
_numrow = 0;
_anterow = 0;
_nuevarow = 0;
_nc = 0;
_recuperada = 0;
 //BA.debugLineNum = 628;BA.debugLine="Private strsalida, strlinea As String";
_strsalida = "";
_strlinea = "";
 //BA.debugLineNum = 629;BA.debugLine="Private head As List";
_head = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 630;BA.debugLine="Private contenido As String";
_contenido = "";
 //BA.debugLineNum = 631;BA.debugLine="Private sealev As Float";
_sealev = 0f;
 //BA.debugLineNum = 633;BA.debugLine="fentrada = Nombre";
_fentrada = _nombre;
 //BA.debugLineNum = 636;BA.debugLine="numrowreal = 0";
_numrowreal = (int) (0);
 //BA.debugLineNum = 637;BA.debugLine="recuperada = 0";
_recuperada = (int) (0);
 //BA.debugLineNum = 638;BA.debugLine="anterow = 0";
_anterow = (int) (0);
 //BA.debugLineNum = 640;BA.debugLine="If File.Exists(File.DirApp,fentrada) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fentrada)) { 
 //BA.debugLineNum = 641;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 642;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 650;BA.debugLine="contenido = File.ReadString(File.DirApp,fentrada";
_contenido = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fentrada);
 //BA.debugLineNum = 652;BA.debugLine="If contenido.IndexOf(\"#\") = 0 Then";
if (_contenido.indexOf("#")==0) { 
 //BA.debugLineNum = 653;BA.debugLine="If contenido.LastIndexOf(\"#\") > 0 Then";
if (_contenido.lastIndexOf("#")>0) { 
 //BA.debugLineNum = 655;BA.debugLine="Lpiepag.Text = \"Multiple starting simbol #\"";
_lpiepag.setText("Multiple starting simbol #");
 //BA.debugLineNum = 657;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 659;BA.debugLine="Table = su.LoadCSV2( File.DirApp,fentrada, Chr(";
_table = _su.LoadCSV2(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fentrada,anywheresoftware.b4a.keywords.Common.Chr((int) (9)),_head);
 //BA.debugLineNum = 661;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 662;BA.debugLine="MVmin = 100";
_mvmin = (float) (100);
 //BA.debugLineNum = 663;BA.debugLine="MVmax = 0";
_mvmax = (float) (0);
 }else {
 //BA.debugLineNum = 665;BA.debugLine="MVmin = 0";
_mvmin = (float) (0);
 //BA.debugLineNum = 666;BA.debugLine="MVmax = -100";
_mvmax = (float) (-100);
 };
 //BA.debugLineNum = 668;BA.debugLine="TempIRmin = 100";
_tempirmin = (float) (100);
 //BA.debugLineNum = 670;BA.debugLine="For nc = 0 To  145";
{
final int step31 = 1;
final int limit31 = (int) (145);
_nc = (int) (0) ;
for (;_nc <= limit31 ;_nc = _nc + step31 ) {
 //BA.debugLineNum = 671;BA.debugLine="MagAS(nc) = 22";
_magas[_nc] = (float) (22);
 }
};
 //BA.debugLineNum = 674;BA.debugLine="For Each row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group34 = _table;
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_row = (String[])(group34.Get(index34));
 //BA.debugLineNum = 675;BA.debugLine="numrow = row(0)";
_numrow = (int)(Double.parseDouble(_row[(int) (0)]));
 //BA.debugLineNum = 676;BA.debugLine="If numrow = 0 Then";
if (_numrow==0) { 
 //BA.debugLineNum = 677;BA.debugLine="numrow = 1";
_numrow = (int) (1);
 };
 //BA.debugLineNum = 681;BA.debugLine="numrowreal = numrowreal + 1";
_numrowreal = (int) (_numrowreal+1);
 //BA.debugLineNum = 688;BA.debugLine="If numrow = anterow + 1  Then";
if (_numrow==_anterow+1) { 
 }else if(_numrow==_anterow+2) { 
 //BA.debugLineNum = 691;BA.debugLine="If CBtemper.Checked = True Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 692;BA.debugLine="MagAS(numrow-1) = row(3)";
_magas[(int) (_numrow-1)] = (float)(Double.parseDouble(_row[(int) (3)]));
 }else {
 //BA.debugLineNum = 694;BA.debugLine="MagAS(numrow-1) = row(5)";
_magas[(int) (_numrow-1)] = (float)(Double.parseDouble(_row[(int) (5)]));
 };
 //BA.debugLineNum = 697;BA.debugLine="recuperada = recuperada + 1";
_recuperada = (int) (_recuperada+1);
 }else if(_numrow==_anterow+3) { 
 //BA.debugLineNum = 700;BA.debugLine="If CBtemper.Checked = True Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 701;BA.debugLine="MagAS(numrow-1) = row(3)";
_magas[(int) (_numrow-1)] = (float)(Double.parseDouble(_row[(int) (3)]));
 //BA.debugLineNum = 702;BA.debugLine="MagAS(numrow-2) = row(3)";
_magas[(int) (_numrow-2)] = (float)(Double.parseDouble(_row[(int) (3)]));
 }else {
 //BA.debugLineNum = 704;BA.debugLine="MagAS(numrow-1) = row(5)";
_magas[(int) (_numrow-1)] = (float)(Double.parseDouble(_row[(int) (5)]));
 //BA.debugLineNum = 705;BA.debugLine="MagAS(numrow-2) = row(5)";
_magas[(int) (_numrow-2)] = (float)(Double.parseDouble(_row[(int) (5)]));
 };
 //BA.debugLineNum = 707;BA.debugLine="recuperada = recuperada + 1";
_recuperada = (int) (_recuperada+1);
 };
 //BA.debugLineNum = 709;BA.debugLine="anterow = numrow";
_anterow = _numrow;
 //BA.debugLineNum = 713;BA.debugLine="altura = row(7)";
_altura = (float)(Double.parseDouble(_row[(int) (7)]));
 //BA.debugLineNum = 714;BA.debugLine="acimut = row(8)";
_acimut = (float)(Double.parseDouble(_row[(int) (8)]));
 //BA.debugLineNum = 716;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 717;BA.debugLine="MagAS(numrow) = row(5)  		'brillo";
_magas[_numrow] = (float)(Double.parseDouble(_row[(int) (5)]));
 //BA.debugLineNum = 718;BA.debugLine="If MagAS(numrow) < MVmin Then";
if (_magas[_numrow]<_mvmin) { 
 //BA.debugLineNum = 719;BA.debugLine="MVmin = MagAS(numrow)";
_mvmin = _magas[_numrow];
 }else if(_magas[_numrow]>_mvmax) { 
 //BA.debugLineNum = 721;BA.debugLine="MVmax = MagAS(numrow)";
_mvmax = _magas[_numrow];
 };
 }else {
 //BA.debugLineNum = 724;BA.debugLine="MagAS(numrow) = row(3)  		'temp IR";
_magas[_numrow] = (float)(Double.parseDouble(_row[(int) (3)]));
 //BA.debugLineNum = 725;BA.debugLine="If MagAS(numrow) < MVmin Then";
if (_magas[_numrow]<_mvmin) { 
 //BA.debugLineNum = 726;BA.debugLine="MVmin = MagAS(numrow)";
_mvmin = _magas[_numrow];
 }else if(_magas[_numrow]>_mvmax) { 
 //BA.debugLineNum = 728;BA.debugLine="MVmax = MagAS(numrow)";
_mvmax = _magas[_numrow];
 //BA.debugLineNum = 729;BA.debugLine="If MVmax > 0 Then";
if (_mvmax>0) { 
 //BA.debugLineNum = 730;BA.debugLine="MVmax = 0";
_mvmax = (float) (0);
 };
 };
 };
 //BA.debugLineNum = 737;BA.debugLine="Try";
try { //BA.debugLineNum = 738;BA.debugLine="sealev = row(11) 'cuando no hay GPS parece fa";
_sealev = (float)(Double.parseDouble(_row[(int) (11)]));
 } 
       catch (Exception e82) {
			ba.setLastException(e82); //BA.debugLineNum = 741;BA.debugLine="sealev = 0";
_sealev = (float) (0);
 };
 //BA.debugLineNum = 744;BA.debugLine="If (row(3) < TempIRmin) Then";
if (((double)(Double.parseDouble(_row[(int) (3)]))<_tempirmin)) { 
 //BA.debugLineNum = 745;BA.debugLine="TempIRmin = row(3)";
_tempirmin = (float)(Double.parseDouble(_row[(int) (3)]));
 //BA.debugLineNum = 746;BA.debugLine="TempAmb = row(4)";
_tempamb = (float)(Double.parseDouble(_row[(int) (4)]));
 };
 //BA.debugLineNum = 748;BA.debugLine="Private corto As String";
_corto = "";
 //BA.debugLineNum = 749;BA.debugLine="corto = row(10).SubString2(0, row(10).IndexOf(";
_corto = _row[(int) (10)].substring((int) (0),(int) (_row[(int) (10)].indexOf(",")+2));
 //BA.debugLineNum = 750;BA.debugLine="LatLongSl =  \"  \" & row(2) & \"     Lat: \" &  r";
_latlongsl = "  "+_row[(int) (2)]+"     Lat: "+_row[(int) (9)].substring((int) (0),(int) (_row[(int) (9)].indexOf(",")+2))+"  Lon: "+_corto;
 //BA.debugLineNum = 751;BA.debugLine="LatLongSl = LatLongSl  & \"  SL: \" & sealev & \"";
_latlongsl = _latlongsl+"  SL: "+BA.NumberToString(_sealev)+" m";
 }
};
 //BA.debugLineNum = 757;BA.debugLine="If numrowreal = 145 Then";
if (_numrowreal==145) { 
 //BA.debugLineNum = 758;BA.debugLine="Lpiepag.Text = \"OK, \" & numrowreal & \" rows fo";
_lpiepag.setText("OK, "+BA.NumberToString(_numrowreal)+" rows found. Max: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmax,(int) (1)))+" Min: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmin,(int) (1))));
 //BA.debugLineNum = 760;BA.debugLine="Lmvmax.Text = \"H: \" &  Round2( MVmax,1)";
_lmvmax.setText("H: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmax,(int) (1))));
 //BA.debugLineNum = 761;BA.debugLine="Lmvmin.Text =\"L: \" &  Round2( MVmin,1)";
_lmvmin.setText("L: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmin,(int) (1))));
 }else {
 //BA.debugLineNum = 764;BA.debugLine="Lpiepag.Text = \"  Lost: \" & (145 - numrowreal)";
_lpiepag.setText("  Lost: "+BA.NumberToString((145-_numrowreal))+" rows of 145."+"  Restored: "+BA.NumberToString(_recuperada)+"  Max: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmax,(int) (1)))+" Min: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmin,(int) (1))));
 //BA.debugLineNum = 765;BA.debugLine="recuperada = 0";
_recuperada = (int) (0);
 };
 }else {
 //BA.debugLineNum = 770;BA.debugLine="Lpiepag.Text = \"Starting simbol # not found.\"";
_lpiepag.setText("Starting simbol # not found.");
 };
 }else {
 //BA.debugLineNum = 775;BA.debugLine="Lpiepag.Text =  fentrada & \"  not found. \"";
_lpiepag.setText(_fentrada+"  not found. ");
 };
 //BA.debugLineNum = 778;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 72;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 61;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 62;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\") 'Load the";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
 //BA.debugLineNum = 63;BA.debugLine="MainForm.Title = \"TAS Plot\"";
_mainform.setTitle("TAS Plot");
 //BA.debugLineNum = 64;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 65;BA.debugLine="rango = 1.9";
_rango = (float) (1.9);
 //BA.debugLineNum = 66;BA.debugLine="Bshowfiles_Action";
_bshowfiles_action();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _bmas_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1157;BA.debugLine="Sub Bmas_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 1158;BA.debugLine="Brillomin = Brillomin + 0.1";
_brillomin = (float) (_brillomin+0.1);
 //BA.debugLineNum = 1160;BA.debugLine="If AS145 = True Then";
if (_as145==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1161;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 1162;BA.debugLine="PreparaSectores145";
_preparasectores145();
 }else {
 //BA.debugLineNum = 1164;BA.debugLine="PreparaSectores";
_preparasectores();
 };
 //BA.debugLineNum = 1166;BA.debugLine="Lmvmin.Text = \"L: \" & Round2( Brillomin, 1)";
_lmvmin.setText("L: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_brillomin,(int) (1))));
 //BA.debugLineNum = 1167;BA.debugLine="End Sub";
return "";
}
public static String  _bmenos_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1169;BA.debugLine="Sub Bmenos_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 1170;BA.debugLine="Brillomin = Brillomin - 0.1";
_brillomin = (float) (_brillomin-0.1);
 //BA.debugLineNum = 1172;BA.debugLine="If AS145 = True Then";
if (_as145==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1173;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 1174;BA.debugLine="PreparaSectores145";
_preparasectores145();
 }else {
 //BA.debugLineNum = 1176;BA.debugLine="PreparaSectores";
_preparasectores();
 };
 //BA.debugLineNum = 1178;BA.debugLine="Lmvmin.Text = \"L: \" & Round2( Brillomin, 1)";
_lmvmin.setText("L: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_brillomin,(int) (1))));
 //BA.debugLineNum = 1179;BA.debugLine="End Sub";
return "";
}
public static String  _bmmas_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1182;BA.debugLine="Sub BMmas_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 1183;BA.debugLine="Brillomax = Brillomax + 0.1";
_brillomax = (float) (_brillomax+0.1);
 //BA.debugLineNum = 1185;BA.debugLine="If AS145 = True Then";
if (_as145==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1186;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 1187;BA.debugLine="PreparaSectores145";
_preparasectores145();
 }else {
 //BA.debugLineNum = 1189;BA.debugLine="PreparaSectores";
_preparasectores();
 };
 //BA.debugLineNum = 1191;BA.debugLine="Lmvmax.Text =\"H: \" & Round2( Brillomax, 1)";
_lmvmax.setText("H: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_brillomax,(int) (1))));
 //BA.debugLineNum = 1192;BA.debugLine="End Sub";
return "";
}
public static String  _bmmenos_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1194;BA.debugLine="Sub BMmenos_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 1195;BA.debugLine="Brillomax = Brillomax - 0.1";
_brillomax = (float) (_brillomax-0.1);
 //BA.debugLineNum = 1197;BA.debugLine="If AS145 = True Then";
if (_as145==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1198;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 1199;BA.debugLine="PreparaSectores145";
_preparasectores145();
 }else {
 //BA.debugLineNum = 1201;BA.debugLine="PreparaSectores";
_preparasectores();
 };
 //BA.debugLineNum = 1203;BA.debugLine="Lmvmax.Text =\"H: \" &  Round2( Brillomax, 1)";
_lmvmax.setText("H: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_brillomax,(int) (1))));
 //BA.debugLineNum = 1204;BA.debugLine="End Sub";
return "";
}
public static String  _bsavebmp_action() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mybm = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _myfn = "";
 //BA.debugLineNum = 949;BA.debugLine="Sub Bsavebmp_Action";
 //BA.debugLineNum = 950;BA.debugLine="Private mybm As B4XBitmap";
_mybm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 951;BA.debugLine="Dim Out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 952;BA.debugLine="Private myfn As String";
_myfn = "";
 //BA.debugLineNum = 954;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 955;BA.debugLine="myfn = fentrada.SubString2(0, fentrada.IndexOf(\"";
_myfn = _fentrada.substring((int) (0),_fentrada.indexOf("."));
 }else {
 //BA.debugLineNum = 957;BA.debugLine="myfn = fentrada.SubString2(0, fentrada.IndexOf(\"";
_myfn = _fentrada.substring((int) (0),_fentrada.indexOf("."));
 //BA.debugLineNum = 958;BA.debugLine="myfn = myfn & \"_IR\"";
_myfn = _myfn+"_IR";
 };
 //BA.debugLineNum = 961;BA.debugLine="Lpiepag.Text = myfn & \"  ok\"";
_lpiepag.setText(_myfn+"  ok");
 //BA.debugLineNum = 962;BA.debugLine="If AS145 = False Then";
if (_as145==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 963;BA.debugLine="File.Copy(File.DirApp, \"sel.txt\", File.DirApp, m";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sel.txt",anywheresoftware.b4a.keywords.Common.File.getDirApp(),_myfn+"_out.csv");
 };
 //BA.debugLineNum = 966;BA.debugLine="mybm = grafica.CreateBitmap";
_mybm = _grafica.CreateBitmap();
 //BA.debugLineNum = 967;BA.debugLine="Out = File.OpenOutput(File.DirApp, myfn & \".png\",";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_myfn+".png",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 968;BA.debugLine="mybm.WriteToStream(Out, 100, \"PNG\")";
_mybm.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),"PNG");
 //BA.debugLineNum = 969;BA.debugLine="Out.Close";
_out.Close();
 //BA.debugLineNum = 970;BA.debugLine="End Sub";
return "";
}
public static String  _bshowfiles_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _listafiles = null;
int _i = 0;
String _fichero = "";
 //BA.debugLineNum = 926;BA.debugLine="Sub Bshowfiles_Action   'refresca lista ficheros";
 //BA.debugLineNum = 927;BA.debugLine="Dim listafiles As List";
_listafiles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 928;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 929;BA.debugLine="Dim fichero As String";
_fichero = "";
 //BA.debugLineNum = 931;BA.debugLine="ListView1.Items.Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 934;BA.debugLine="listafiles = File.ListFiles(File.DirApp)";
_listafiles = anywheresoftware.b4a.keywords.Common.File.ListFiles(anywheresoftware.b4a.keywords.Common.File.getDirApp());
 //BA.debugLineNum = 935;BA.debugLine="Log(listafiles.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_listafiles.getSize()));
 //BA.debugLineNum = 936;BA.debugLine="For i = 0 To  listafiles.Size -1";
{
final int step7 = 1;
final int limit7 = (int) (_listafiles.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 937;BA.debugLine="fichero =  	listafiles.Get(i)";
_fichero = BA.ObjectToString(_listafiles.Get(_i));
 //BA.debugLineNum = 938;BA.debugLine="If  fichero.Contains(\"txt\") Then";
if (_fichero.contains("txt")) { 
 //BA.debugLineNum = 939;BA.debugLine="If fichero.Contains(\"_AS_\")  Then";
if (_fichero.contains("_AS_")) { 
 //BA.debugLineNum = 940;BA.debugLine="ListView1.Items.Add(listafiles.Get(i) )";
_listview1.getItems().Add(_listafiles.Get(_i));
 };
 };
 }
};
 //BA.debugLineNum = 944;BA.debugLine="ListView1.Items.Sort(True)";
_listview1.getItems().Sort(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return "";
}
public static String  _bz() throws Exception{
float _ma = 0f;
String _nombre_fichero = "";
int _nlinea = 0;
int[] _naltura = null;
int[] _nazimuth = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f12 = null;
String _fich = "";
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _row = null;
 //BA.debugLineNum = 188;BA.debugLine="Private Sub bz	' Del fichero intermedio extrae tab";
 //BA.debugLineNum = 192;BA.debugLine="Private ma As Float";
_ma = 0f;
 //BA.debugLineNum = 193;BA.debugLine="Private nombre_fichero As String";
_nombre_fichero = "";
 //BA.debugLineNum = 197;BA.debugLine="Private nlinea As Int";
_nlinea = 0;
 //BA.debugLineNum = 198;BA.debugLine="Private naltura(48), nazimuth(48) As Int";
_naltura = new int[(int) (48)];
;
_nazimuth = new int[(int) (48)];
;
 //BA.debugLineNum = 199;BA.debugLine="Dim f12 As B4XFont = xui.CreateDefaultFont(10)";
_f12 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_f12 = _xui.CreateDefaultFont((float) (10));
 //BA.debugLineNum = 200;BA.debugLine="Private fich As String";
_fich = "";
 //BA.debugLineNum = 202;BA.debugLine="naltura(0) = 0";
_naltura[(int) (0)] = (int) (0);
 //BA.debugLineNum = 203;BA.debugLine="naltura(1) = 1";
_naltura[(int) (1)] = (int) (1);
 //BA.debugLineNum = 204;BA.debugLine="naltura(2) = 2";
_naltura[(int) (2)] = (int) (2);
 //BA.debugLineNum = 205;BA.debugLine="naltura(3) = 3";
_naltura[(int) (3)] = (int) (3);
 //BA.debugLineNum = 206;BA.debugLine="naltura(4) = 3";
_naltura[(int) (4)] = (int) (3);
 //BA.debugLineNum = 207;BA.debugLine="naltura(5) = 2";
_naltura[(int) (5)] = (int) (2);
 //BA.debugLineNum = 208;BA.debugLine="naltura(6) = 1";
_naltura[(int) (6)] = (int) (1);
 //BA.debugLineNum = 209;BA.debugLine="naltura(7) = 0";
_naltura[(int) (7)] = (int) (0);
 //BA.debugLineNum = 211;BA.debugLine="naltura(8) = 0";
_naltura[(int) (8)] = (int) (0);
 //BA.debugLineNum = 212;BA.debugLine="naltura(9) = 1";
_naltura[(int) (9)] = (int) (1);
 //BA.debugLineNum = 213;BA.debugLine="naltura(10) = 2";
_naltura[(int) (10)] = (int) (2);
 //BA.debugLineNum = 214;BA.debugLine="naltura(11) = 3";
_naltura[(int) (11)] = (int) (3);
 //BA.debugLineNum = 215;BA.debugLine="naltura(12) = 3";
_naltura[(int) (12)] = (int) (3);
 //BA.debugLineNum = 216;BA.debugLine="naltura(13) = 2";
_naltura[(int) (13)] = (int) (2);
 //BA.debugLineNum = 217;BA.debugLine="naltura(14) = 1";
_naltura[(int) (14)] = (int) (1);
 //BA.debugLineNum = 218;BA.debugLine="naltura(15) = 0";
_naltura[(int) (15)] = (int) (0);
 //BA.debugLineNum = 220;BA.debugLine="naltura(16) = 0";
_naltura[(int) (16)] = (int) (0);
 //BA.debugLineNum = 221;BA.debugLine="naltura(17) = 1";
_naltura[(int) (17)] = (int) (1);
 //BA.debugLineNum = 222;BA.debugLine="naltura(18) = 2";
_naltura[(int) (18)] = (int) (2);
 //BA.debugLineNum = 223;BA.debugLine="naltura(19) = 3";
_naltura[(int) (19)] = (int) (3);
 //BA.debugLineNum = 224;BA.debugLine="naltura(20) = 3";
_naltura[(int) (20)] = (int) (3);
 //BA.debugLineNum = 225;BA.debugLine="naltura(21) = 2";
_naltura[(int) (21)] = (int) (2);
 //BA.debugLineNum = 226;BA.debugLine="naltura(22) = 1";
_naltura[(int) (22)] = (int) (1);
 //BA.debugLineNum = 227;BA.debugLine="naltura(23) = 0";
_naltura[(int) (23)] = (int) (0);
 //BA.debugLineNum = 229;BA.debugLine="naltura(24) = 0";
_naltura[(int) (24)] = (int) (0);
 //BA.debugLineNum = 230;BA.debugLine="naltura(25) = 1";
_naltura[(int) (25)] = (int) (1);
 //BA.debugLineNum = 231;BA.debugLine="naltura(26) = 2";
_naltura[(int) (26)] = (int) (2);
 //BA.debugLineNum = 232;BA.debugLine="naltura(27) = 3";
_naltura[(int) (27)] = (int) (3);
 //BA.debugLineNum = 233;BA.debugLine="naltura(28) = 3";
_naltura[(int) (28)] = (int) (3);
 //BA.debugLineNum = 234;BA.debugLine="naltura(29) = 2";
_naltura[(int) (29)] = (int) (2);
 //BA.debugLineNum = 235;BA.debugLine="naltura(30) = 1";
_naltura[(int) (30)] = (int) (1);
 //BA.debugLineNum = 236;BA.debugLine="naltura(31) = 0";
_naltura[(int) (31)] = (int) (0);
 //BA.debugLineNum = 238;BA.debugLine="naltura(32) = 0";
_naltura[(int) (32)] = (int) (0);
 //BA.debugLineNum = 239;BA.debugLine="naltura(33) = 1";
_naltura[(int) (33)] = (int) (1);
 //BA.debugLineNum = 240;BA.debugLine="naltura(34) = 2";
_naltura[(int) (34)] = (int) (2);
 //BA.debugLineNum = 241;BA.debugLine="naltura(35) = 3";
_naltura[(int) (35)] = (int) (3);
 //BA.debugLineNum = 242;BA.debugLine="naltura(36) = 3";
_naltura[(int) (36)] = (int) (3);
 //BA.debugLineNum = 243;BA.debugLine="naltura(37) = 2";
_naltura[(int) (37)] = (int) (2);
 //BA.debugLineNum = 244;BA.debugLine="naltura(38) = 1";
_naltura[(int) (38)] = (int) (1);
 //BA.debugLineNum = 245;BA.debugLine="naltura(39) = 0";
_naltura[(int) (39)] = (int) (0);
 //BA.debugLineNum = 247;BA.debugLine="naltura(40) = 0";
_naltura[(int) (40)] = (int) (0);
 //BA.debugLineNum = 248;BA.debugLine="naltura(41) = 1";
_naltura[(int) (41)] = (int) (1);
 //BA.debugLineNum = 249;BA.debugLine="naltura(42) = 2";
_naltura[(int) (42)] = (int) (2);
 //BA.debugLineNum = 250;BA.debugLine="naltura(43) = 3";
_naltura[(int) (43)] = (int) (3);
 //BA.debugLineNum = 251;BA.debugLine="naltura(44) = 3";
_naltura[(int) (44)] = (int) (3);
 //BA.debugLineNum = 252;BA.debugLine="naltura(45) = 2";
_naltura[(int) (45)] = (int) (2);
 //BA.debugLineNum = 253;BA.debugLine="naltura(46) = 1";
_naltura[(int) (46)] = (int) (1);
 //BA.debugLineNum = 254;BA.debugLine="naltura(47) = 0";
_naltura[(int) (47)] = (int) (0);
 //BA.debugLineNum = 256;BA.debugLine="nazimuth(0) = 0";
_nazimuth[(int) (0)] = (int) (0);
 //BA.debugLineNum = 257;BA.debugLine="nazimuth(1) = 0";
_nazimuth[(int) (1)] = (int) (0);
 //BA.debugLineNum = 258;BA.debugLine="nazimuth(2) = 0";
_nazimuth[(int) (2)] = (int) (0);
 //BA.debugLineNum = 259;BA.debugLine="nazimuth(3) = 0";
_nazimuth[(int) (3)] = (int) (0);
 //BA.debugLineNum = 260;BA.debugLine="nazimuth(4) = 6";
_nazimuth[(int) (4)] = (int) (6);
 //BA.debugLineNum = 261;BA.debugLine="nazimuth(5) = 6";
_nazimuth[(int) (5)] = (int) (6);
 //BA.debugLineNum = 262;BA.debugLine="nazimuth(6) = 6";
_nazimuth[(int) (6)] = (int) (6);
 //BA.debugLineNum = 263;BA.debugLine="nazimuth(7) = 6";
_nazimuth[(int) (7)] = (int) (6);
 //BA.debugLineNum = 265;BA.debugLine="nazimuth(8) = 1";
_nazimuth[(int) (8)] = (int) (1);
 //BA.debugLineNum = 266;BA.debugLine="nazimuth(9) = 1";
_nazimuth[(int) (9)] = (int) (1);
 //BA.debugLineNum = 267;BA.debugLine="nazimuth(10) = 1";
_nazimuth[(int) (10)] = (int) (1);
 //BA.debugLineNum = 268;BA.debugLine="nazimuth(11) = 1";
_nazimuth[(int) (11)] = (int) (1);
 //BA.debugLineNum = 269;BA.debugLine="nazimuth(12) = 7";
_nazimuth[(int) (12)] = (int) (7);
 //BA.debugLineNum = 270;BA.debugLine="nazimuth(13) = 7";
_nazimuth[(int) (13)] = (int) (7);
 //BA.debugLineNum = 271;BA.debugLine="nazimuth(14) = 7";
_nazimuth[(int) (14)] = (int) (7);
 //BA.debugLineNum = 272;BA.debugLine="nazimuth(15) = 7";
_nazimuth[(int) (15)] = (int) (7);
 //BA.debugLineNum = 274;BA.debugLine="nazimuth(16) = 2";
_nazimuth[(int) (16)] = (int) (2);
 //BA.debugLineNum = 275;BA.debugLine="nazimuth(17) = 2";
_nazimuth[(int) (17)] = (int) (2);
 //BA.debugLineNum = 276;BA.debugLine="nazimuth(18) = 2";
_nazimuth[(int) (18)] = (int) (2);
 //BA.debugLineNum = 277;BA.debugLine="nazimuth(19) = 2";
_nazimuth[(int) (19)] = (int) (2);
 //BA.debugLineNum = 278;BA.debugLine="nazimuth(20) = 8";
_nazimuth[(int) (20)] = (int) (8);
 //BA.debugLineNum = 279;BA.debugLine="nazimuth(21) = 8";
_nazimuth[(int) (21)] = (int) (8);
 //BA.debugLineNum = 280;BA.debugLine="nazimuth(22) = 8";
_nazimuth[(int) (22)] = (int) (8);
 //BA.debugLineNum = 281;BA.debugLine="nazimuth(23) = 8";
_nazimuth[(int) (23)] = (int) (8);
 //BA.debugLineNum = 284;BA.debugLine="nazimuth(24) = 3";
_nazimuth[(int) (24)] = (int) (3);
 //BA.debugLineNum = 285;BA.debugLine="nazimuth(25) = 3";
_nazimuth[(int) (25)] = (int) (3);
 //BA.debugLineNum = 286;BA.debugLine="nazimuth(26) = 3";
_nazimuth[(int) (26)] = (int) (3);
 //BA.debugLineNum = 287;BA.debugLine="nazimuth(27) = 3";
_nazimuth[(int) (27)] = (int) (3);
 //BA.debugLineNum = 288;BA.debugLine="nazimuth(28) = 9";
_nazimuth[(int) (28)] = (int) (9);
 //BA.debugLineNum = 289;BA.debugLine="nazimuth(29) = 9";
_nazimuth[(int) (29)] = (int) (9);
 //BA.debugLineNum = 290;BA.debugLine="nazimuth(30) = 9";
_nazimuth[(int) (30)] = (int) (9);
 //BA.debugLineNum = 291;BA.debugLine="nazimuth(31) = 9";
_nazimuth[(int) (31)] = (int) (9);
 //BA.debugLineNum = 293;BA.debugLine="nazimuth(32) = 4";
_nazimuth[(int) (32)] = (int) (4);
 //BA.debugLineNum = 294;BA.debugLine="nazimuth(33) = 4";
_nazimuth[(int) (33)] = (int) (4);
 //BA.debugLineNum = 295;BA.debugLine="nazimuth(34) = 4";
_nazimuth[(int) (34)] = (int) (4);
 //BA.debugLineNum = 296;BA.debugLine="nazimuth(35) = 4";
_nazimuth[(int) (35)] = (int) (4);
 //BA.debugLineNum = 297;BA.debugLine="nazimuth(36) = 10";
_nazimuth[(int) (36)] = (int) (10);
 //BA.debugLineNum = 298;BA.debugLine="nazimuth(37) = 10";
_nazimuth[(int) (37)] = (int) (10);
 //BA.debugLineNum = 299;BA.debugLine="nazimuth(38) = 10";
_nazimuth[(int) (38)] = (int) (10);
 //BA.debugLineNum = 300;BA.debugLine="nazimuth(39) = 10";
_nazimuth[(int) (39)] = (int) (10);
 //BA.debugLineNum = 302;BA.debugLine="nazimuth(40) = 5";
_nazimuth[(int) (40)] = (int) (5);
 //BA.debugLineNum = 303;BA.debugLine="nazimuth(41) = 5";
_nazimuth[(int) (41)] = (int) (5);
 //BA.debugLineNum = 304;BA.debugLine="nazimuth(42) = 5";
_nazimuth[(int) (42)] = (int) (5);
 //BA.debugLineNum = 305;BA.debugLine="nazimuth(43) = 5";
_nazimuth[(int) (43)] = (int) (5);
 //BA.debugLineNum = 306;BA.debugLine="nazimuth(44) = 11";
_nazimuth[(int) (44)] = (int) (11);
 //BA.debugLineNum = 307;BA.debugLine="nazimuth(45) = 11";
_nazimuth[(int) (45)] = (int) (11);
 //BA.debugLineNum = 308;BA.debugLine="nazimuth(46) = 11";
_nazimuth[(int) (46)] = (int) (11);
 //BA.debugLineNum = 309;BA.debugLine="nazimuth(47) = 11";
_nazimuth[(int) (47)] = (int) (11);
 //BA.debugLineNum = 311;BA.debugLine="nombre_fichero = \"sel.txt\"	'fichero intermedio co";
_nombre_fichero = "sel.txt";
 //BA.debugLineNum = 313;BA.debugLine="If File.Exists(File.DirApp, nombre_fichero) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_nombre_fichero)) { 
 //BA.debugLineNum = 314;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 315;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 317;BA.debugLine="Table = su.LoadCSV(File.DirApp,nombre_fichero, C";
_table = _su.LoadCSV(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_nombre_fichero,anywheresoftware.b4a.keywords.Common.Chr((int) (9)));
 //BA.debugLineNum = 318;BA.debugLine="nlinea = 0";
_nlinea = (int) (0);
 //BA.debugLineNum = 321;BA.debugLine="For Each Row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group109 = _table;
final int groupLen109 = group109.getSize()
;int index109 = 0;
;
for (; index109 < groupLen109;index109++){
_row = (String[])(group109.Get(index109));
 //BA.debugLineNum = 323;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 324;BA.debugLine="ma = Row(5)  'brillo";
_ma = (float)(Double.parseDouble(_row[(int) (5)]));
 //BA.debugLineNum = 325;BA.debugLine="If ma < MVmin Then";
if (_ma<_mvmin) { 
 //BA.debugLineNum = 326;BA.debugLine="MVmin = ma";
_mvmin = _ma;
 }else if(_ma>_mvmax) { 
 //BA.debugLineNum = 328;BA.debugLine="MVmax = ma";
_mvmax = _ma;
 };
 }else {
 //BA.debugLineNum = 331;BA.debugLine="ma = Row(3)  'temp IR";
_ma = (float)(Double.parseDouble(_row[(int) (3)]));
 //BA.debugLineNum = 332;BA.debugLine="If ma < MVmin Then";
if (_ma<_mvmin) { 
 //BA.debugLineNum = 333;BA.debugLine="MVmin = ma";
_mvmin = _ma;
 }else if(_ma>_mvmax) { 
 //BA.debugLineNum = 335;BA.debugLine="MVmax = ma";
_mvmax = _ma;
 //BA.debugLineNum = 336;BA.debugLine="If MVmax > 0 Then";
if (_mvmax>0) { 
 //BA.debugLineNum = 337;BA.debugLine="MVmax = 0";
_mvmax = (float) (0);
 };
 };
 };
 //BA.debugLineNum = 343;BA.debugLine="If nlinea < 48 Then";
if (_nlinea<48) { 
 //BA.debugLineNum = 344;BA.debugLine="mag2(naltura(nlinea), nazimuth(nlinea)) = ma";
_mag2[_naltura[_nlinea]][_nazimuth[_nlinea]] = _ma;
 //BA.debugLineNum = 345;BA.debugLine="nlinea = nlinea + 1";
_nlinea = (int) (_nlinea+1);
 };
 }
};
 }else {
 //BA.debugLineNum = 350;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 353;BA.debugLine="If nlinea > 47 Then		' terminada tabla se pinta";
if (_nlinea>47) { 
 //BA.debugLineNum = 370;BA.debugLine="PreparaSectores";
_preparasectores();
 };
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return "";
}
public static String  _caldifacimut(int _ac1,int _ac2) throws Exception{
 //BA.debugLineNum = 605;BA.debugLine="Sub caldifacimut(ac1 As Int, ac2 As Int)";
 //BA.debugLineNum = 607;BA.debugLine="If ( (ac1 > 350) And (ac2 < 10)) Then";
if (((_ac1>350) && (_ac2<10))) { 
 //BA.debugLineNum = 608;BA.debugLine="difacimut = (360 - ac1 + ac2)";
_difacimut = (int) ((360-_ac1+_ac2));
 }else if(((_ac1<10) && (_ac2>350))) { 
 //BA.debugLineNum = 610;BA.debugLine="difacimut =  360 - ac2 + ac1";
_difacimut = (int) (360-_ac2+_ac1);
 }else {
 //BA.debugLineNum = 612;BA.debugLine="difacimut = Abs(ac1 - ac2)";
_difacimut = (int) (anywheresoftware.b4a.keywords.Common.Abs(_ac1-_ac2));
 };
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return "";
}
public static String  _cargapaletanixnox() throws Exception{
 //BA.debugLineNum = 1035;BA.debugLine="Sub CargaPaletaNixNox";
 //BA.debugLineNum = 1036;BA.debugLine="mR(0)= 8";
_mr[(int) (0)] = (int) (8);
 //BA.debugLineNum = 1037;BA.debugLine="mR(1)= 17";
_mr[(int) (1)] = (int) (17);
 //BA.debugLineNum = 1038;BA.debugLine="mR(2)= 25";
_mr[(int) (2)] = (int) (25);
 //BA.debugLineNum = 1039;BA.debugLine="mR(3)= 35";
_mr[(int) (3)] = (int) (35);
 //BA.debugLineNum = 1040;BA.debugLine="mR(4)= 34";
_mr[(int) (4)] = (int) (34);
 //BA.debugLineNum = 1041;BA.debugLine="mR(5)= 32";
_mr[(int) (5)] = (int) (32);
 //BA.debugLineNum = 1042;BA.debugLine="mR(6)= 29";
_mr[(int) (6)] = (int) (29);
 //BA.debugLineNum = 1043;BA.debugLine="mR(7)= 41";
_mr[(int) (7)] = (int) (41);
 //BA.debugLineNum = 1044;BA.debugLine="mR(8)= 17";
_mr[(int) (8)] = (int) (17);
 //BA.debugLineNum = 1045;BA.debugLine="mR(9)= 36";
_mr[(int) (9)] = (int) (36);
 //BA.debugLineNum = 1046;BA.debugLine="mR(10)= 32";
_mr[(int) (10)] = (int) (32);
 //BA.debugLineNum = 1047;BA.debugLine="mR(11)= 25";
_mr[(int) (11)] = (int) (25);
 //BA.debugLineNum = 1048;BA.debugLine="mR(12)= 38";
_mr[(int) (12)] = (int) (38);
 //BA.debugLineNum = 1049;BA.debugLine="mR(13)= 29";
_mr[(int) (13)] = (int) (29);
 //BA.debugLineNum = 1050;BA.debugLine="mR(14)= 39";
_mr[(int) (14)] = (int) (39);
 //BA.debugLineNum = 1051;BA.debugLine="mR(15)= 47";
_mr[(int) (15)] = (int) (47);
 //BA.debugLineNum = 1052;BA.debugLine="mR(16)= 54";
_mr[(int) (16)] = (int) (54);
 //BA.debugLineNum = 1053;BA.debugLine="mR(17)= 75";
_mr[(int) (17)] = (int) (75);
 //BA.debugLineNum = 1054;BA.debugLine="mR(18)= 84";
_mr[(int) (18)] = (int) (84);
 //BA.debugLineNum = 1055;BA.debugLine="mR(19)= 108";
_mr[(int) (19)] = (int) (108);
 //BA.debugLineNum = 1056;BA.debugLine="mR(20)= 128";
_mr[(int) (20)] = (int) (128);
 //BA.debugLineNum = 1057;BA.debugLine="mR(21)= 138";
_mr[(int) (21)] = (int) (138);
 //BA.debugLineNum = 1058;BA.debugLine="mR(22)= 148";
_mr[(int) (22)] = (int) (148);
 //BA.debugLineNum = 1060;BA.debugLine="mR(23)= 160";
_mr[(int) (23)] = (int) (160);
 //BA.debugLineNum = 1061;BA.debugLine="mR(24)= 178";
_mr[(int) (24)] = (int) (178);
 //BA.debugLineNum = 1062;BA.debugLine="mR(25)= 202";
_mr[(int) (25)] = (int) (202);
 //BA.debugLineNum = 1063;BA.debugLine="mR(26)= 214";
_mr[(int) (26)] = (int) (214);
 //BA.debugLineNum = 1064;BA.debugLine="mR(27)= 226";
_mr[(int) (27)] = (int) (226);
 //BA.debugLineNum = 1065;BA.debugLine="mR(28)= 237";
_mr[(int) (28)] = (int) (237);
 //BA.debugLineNum = 1066;BA.debugLine="mR(29)= 242";
_mr[(int) (29)] = (int) (242);
 //BA.debugLineNum = 1067;BA.debugLine="mR(30)= 248";
_mr[(int) (30)] = (int) (248);
 //BA.debugLineNum = 1068;BA.debugLine="mR(31)= 251";
_mr[(int) (31)] = (int) (251);
 //BA.debugLineNum = 1070;BA.debugLine="mG(0)= 31";
_mg[(int) (0)] = (int) (31);
 //BA.debugLineNum = 1071;BA.debugLine="mG(1)= 39";
_mg[(int) (1)] = (int) (39);
 //BA.debugLineNum = 1072;BA.debugLine="mG(2)= 46";
_mg[(int) (2)] = (int) (46);
 //BA.debugLineNum = 1073;BA.debugLine="mG(3)= 51";
_mg[(int) (3)] = (int) (51);
 //BA.debugLineNum = 1074;BA.debugLine="mG(4)= 59";
_mg[(int) (4)] = (int) (59);
 //BA.debugLineNum = 1075;BA.debugLine="mG(5)= 67";
_mg[(int) (5)] = (int) (67);
 //BA.debugLineNum = 1076;BA.debugLine="mG(6)= 77";
_mg[(int) (6)] = (int) (77);
 //BA.debugLineNum = 1077;BA.debugLine="mG(7)= 84";
_mg[(int) (7)] = (int) (84);
 //BA.debugLineNum = 1078;BA.debugLine="mG(8)= 94";
_mg[(int) (8)] = (int) (94);
 //BA.debugLineNum = 1079;BA.debugLine="mG(9)= 104";
_mg[(int) (9)] = (int) (104);
 //BA.debugLineNum = 1080;BA.debugLine="mG(10)= 115";
_mg[(int) (10)] = (int) (115);
 //BA.debugLineNum = 1081;BA.debugLine="mG(11)= 126";
_mg[(int) (11)] = (int) (126);
 //BA.debugLineNum = 1082;BA.debugLine="mG(12)= 135";
_mg[(int) (12)] = (int) (135);
 //BA.debugLineNum = 1083;BA.debugLine="mG(13)= 147";
_mg[(int) (13)] = (int) (147);
 //BA.debugLineNum = 1084;BA.debugLine="mG(14)= 155";
_mg[(int) (14)] = (int) (155);
 //BA.debugLineNum = 1085;BA.debugLine="mG(15)= 163";
_mg[(int) (15)] = (int) (163);
 //BA.debugLineNum = 1086;BA.debugLine="mG(16)= 174";
_mg[(int) (16)] = (int) (174);
 //BA.debugLineNum = 1087;BA.debugLine="mG(17)= 184";
_mg[(int) (17)] = (int) (184);
 //BA.debugLineNum = 1088;BA.debugLine="mG(18)= 193";
_mg[(int) (18)] = (int) (193);
 //BA.debugLineNum = 1089;BA.debugLine="mG(19)= 200";
_mg[(int) (19)] = (int) (200);
 //BA.debugLineNum = 1090;BA.debugLine="mG(20)= 204";
_mg[(int) (20)] = (int) (204);
 //BA.debugLineNum = 1091;BA.debugLine="mG(21)= 210";
_mg[(int) (21)] = (int) (210);
 //BA.debugLineNum = 1092;BA.debugLine="mG(22)= 216";
_mg[(int) (22)] = (int) (216);
 //BA.debugLineNum = 1094;BA.debugLine="mG(23)= 220";
_mg[(int) (23)] = (int) (220);
 //BA.debugLineNum = 1095;BA.debugLine="mG(24)= 225";
_mg[(int) (24)] = (int) (225);
 //BA.debugLineNum = 1096;BA.debugLine="mG(25)= 235";
_mg[(int) (25)] = (int) (235);
 //BA.debugLineNum = 1097;BA.debugLine="mG(26)= 239";
_mg[(int) (26)] = (int) (239);
 //BA.debugLineNum = 1098;BA.debugLine="mG(27)= 242";
_mg[(int) (27)] = (int) (242);
 //BA.debugLineNum = 1099;BA.debugLine="mG(28)= 247";
_mg[(int) (28)] = (int) (247);
 //BA.debugLineNum = 1100;BA.debugLine="mG(29)= 251";
_mg[(int) (29)] = (int) (251);
 //BA.debugLineNum = 1101;BA.debugLine="mG(30)= 251";
_mg[(int) (30)] = (int) (251);
 //BA.debugLineNum = 1102;BA.debugLine="mG(31)= 254";
_mg[(int) (31)] = (int) (254);
 //BA.debugLineNum = 1104;BA.debugLine="mB(0)= 96";
_mb[(int) (0)] = (int) (96);
 //BA.debugLineNum = 1105;BA.debugLine="mB(1)= 113";
_mb[(int) (1)] = (int) (113);
 //BA.debugLineNum = 1106;BA.debugLine="mB(2)= 131";
_mb[(int) (2)] = (int) (131);
 //BA.debugLineNum = 1107;BA.debugLine="mB(3)= 144";
_mb[(int) (3)] = (int) (144);
 //BA.debugLineNum = 1108;BA.debugLine="mB(4)= 151";
_mb[(int) (4)] = (int) (151);
 //BA.debugLineNum = 1109;BA.debugLine="mB(5)= 159";
_mb[(int) (5)] = (int) (159);
 //BA.debugLineNum = 1110;BA.debugLine="mB(6)= 161";
_mb[(int) (6)] = (int) (161);
 //BA.debugLineNum = 1111;BA.debugLine="mB(7)= 163";
_mb[(int) (7)] = (int) (163);
 //BA.debugLineNum = 1112;BA.debugLine="mB(8)= 170";
_mb[(int) (8)] = (int) (170);
 //BA.debugLineNum = 1113;BA.debugLine="mB(9)= 174";
_mb[(int) (9)] = (int) (174);
 //BA.debugLineNum = 1114;BA.debugLine="mB(10)= 178";
_mb[(int) (10)] = (int) (178);
 //BA.debugLineNum = 1115;BA.debugLine="mB(11)= 182";
_mb[(int) (11)] = (int) (182);
 //BA.debugLineNum = 1116;BA.debugLine="mB(12)= 185";
_mb[(int) (12)] = (int) (185);
 //BA.debugLineNum = 1117;BA.debugLine="mB(13)= 189";
_mb[(int) (13)] = (int) (189);
 //BA.debugLineNum = 1118;BA.debugLine="mB(14)= 191";
_mb[(int) (14)] = (int) (191);
 //BA.debugLineNum = 1119;BA.debugLine="mB(15)= 193";
_mb[(int) (15)] = (int) (193);
 //BA.debugLineNum = 1120;BA.debugLine="mB(16)= 194";
_mb[(int) (16)] = (int) (194);
 //BA.debugLineNum = 1121;BA.debugLine="mB(17)= 195";
_mb[(int) (17)] = (int) (195);
 //BA.debugLineNum = 1122;BA.debugLine="mB(18)= 194";
_mb[(int) (18)] = (int) (194);
 //BA.debugLineNum = 1123;BA.debugLine="mB(19)= 187";
_mb[(int) (19)] = (int) (187);
 //BA.debugLineNum = 1124;BA.debugLine="mB(20)= 186";
_mb[(int) (20)] = (int) (186);
 //BA.debugLineNum = 1125;BA.debugLine="mB(21)= 187";
_mb[(int) (21)] = (int) (187);
 //BA.debugLineNum = 1126;BA.debugLine="mB(22)= 186";
_mb[(int) (22)] = (int) (186);
 //BA.debugLineNum = 1128;BA.debugLine="mB(23)= 182";
_mb[(int) (23)] = (int) (182);
 //BA.debugLineNum = 1129;BA.debugLine="mB(24)= 182";
_mb[(int) (24)] = (int) (182);
 //BA.debugLineNum = 1130;BA.debugLine="mB(25)= 178";
_mb[(int) (25)] = (int) (178);
 //BA.debugLineNum = 1131;BA.debugLine="mB(26)= 178";
_mb[(int) (26)] = (int) (178);
 //BA.debugLineNum = 1132;BA.debugLine="mB(27)= 176";
_mb[(int) (27)] = (int) (176);
 //BA.debugLineNum = 1133;BA.debugLine="mB(28)= 175";
_mb[(int) (28)] = (int) (175);
 //BA.debugLineNum = 1134;BA.debugLine="mB(29)= 186";
_mb[(int) (29)] = (int) (186);
 //BA.debugLineNum = 1135;BA.debugLine="mB(30)= 194";
_mb[(int) (30)] = (int) (194);
 //BA.debugLineNum = 1136;BA.debugLine="mB(31)= 207";
_mb[(int) (31)] = (int) (207);
 //BA.debugLineNum = 1139;BA.debugLine="End Sub";
return "";
}
public static String  _draw_sector(float _altura,float _azimut,float _magnitud,float _cx,float _cy,anywheresoftware.b4a.objects.B4XCanvas _pcan,int _grados,int _altu) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p1 = null;
float _ang1 = 0f;
float _ang2 = 0f;
float _inc_ang = 0f;
float _x1 = 0f;
float _y1 = 0f;
float _xt = 0f;
float _yt = 0f;
float _r1 = 0f;
float _r2 = 0f;
float _mm = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _ff = null;
int _mpal = 0;
float _ranb = 0f;
int _np = 0;
 //BA.debugLineNum = 78;BA.debugLine="Private Sub draw_sector(altura As Float, azimut As";
 //BA.debugLineNum = 79;BA.debugLine="Dim p1 As B4XPath";
_p1 = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 80;BA.debugLine="Private ang1, ang2, inc_ang, x1, y1, xt, yt, r1,";
_ang1 = 0f;
_ang2 = 0f;
_inc_ang = 0f;
_x1 = 0f;
_y1 = 0f;
_xt = 0f;
_yt = 0f;
_r1 = 0f;
_r2 = 0f;
 //BA.debugLineNum = 81;BA.debugLine="Private mm As Float = magnitud";
_mm = _magnitud;
 //BA.debugLineNum = 82;BA.debugLine="Dim ff As B4XFont = xui.CreateDefaultFont(10)";
_ff = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_ff = _xui.CreateDefaultFont((float) (10));
 //BA.debugLineNum = 83;BA.debugLine="Dim mpal As Int";
_mpal = 0;
 //BA.debugLineNum = 84;BA.debugLine="Dim ranb As Float";
_ranb = 0f;
 //BA.debugLineNum = 86;BA.debugLine="ang1 = azimut -1";
_ang1 = (float) (_azimut-1);
 //BA.debugLineNum = 87;BA.debugLine="alto = altu";
_alto = _altu;
 //BA.debugLineNum = 88;BA.debugLine="ancho = grados";
_ancho = _grados;
 //BA.debugLineNum = 89;BA.debugLine="ang2 = (azimut + ancho ) + 1";
_ang2 = (float) ((_azimut+_ancho)+1);
 //BA.debugLineNum = 90;BA.debugLine="inc_ang = (ang2 - ang1) / 10.0";
_inc_ang = (float) ((_ang2-_ang1)/(double)10.0);
 //BA.debugLineNum = 93;BA.debugLine="altura = altura * 3.0";
_altura = (float) (_altura*3.0);
 //BA.debugLineNum = 95;BA.debugLine="r1 = altura - 1";
_r1 = (float) (_altura-1);
 //BA.debugLineNum = 96;BA.debugLine="r2 = (altura + alto * 3) + 1";
_r2 = (float) ((_altura+_alto*3)+1);
 //BA.debugLineNum = 98;BA.debugLine="x1 = cx + r1 * CosD(ang1)";
_x1 = (float) (_cx+_r1*anywheresoftware.b4a.keywords.Common.CosD(_ang1));
 //BA.debugLineNum = 99;BA.debugLine="y1 = cy + r1 * SinD(ang1)";
_y1 = (float) (_cy+_r1*anywheresoftware.b4a.keywords.Common.SinD(_ang1));
 //BA.debugLineNum = 100;BA.debugLine="p1.Initialize(x1, y1)";
_p1.Initialize(_x1,_y1);
 //BA.debugLineNum = 101;BA.debugLine="x1 = cx + r2 * CosD(ang1)";
_x1 = (float) (_cx+_r2*anywheresoftware.b4a.keywords.Common.CosD(_ang1));
 //BA.debugLineNum = 102;BA.debugLine="y1 = cy + r2 * SinD(ang1)";
_y1 = (float) (_cy+_r2*anywheresoftware.b4a.keywords.Common.SinD(_ang1));
 //BA.debugLineNum = 103;BA.debugLine="p1.LineTo(x1, y1)";
_p1.LineTo(_x1,_y1);
 //BA.debugLineNum = 105;BA.debugLine="For np = 0 To 10";
{
final int step21 = 1;
final int limit21 = (int) (10);
_np = (int) (0) ;
for (;_np <= limit21 ;_np = _np + step21 ) {
 //BA.debugLineNum = 106;BA.debugLine="x1 = cx + r2 * CosD(ang1 + inc_ang * np)";
_x1 = (float) (_cx+_r2*anywheresoftware.b4a.keywords.Common.CosD(_ang1+_inc_ang*_np));
 //BA.debugLineNum = 107;BA.debugLine="y1 = cy + r2 * SinD(ang1 + inc_ang * np)";
_y1 = (float) (_cy+_r2*anywheresoftware.b4a.keywords.Common.SinD(_ang1+_inc_ang*_np));
 //BA.debugLineNum = 108;BA.debugLine="p1.LineTo(x1, y1)";
_p1.LineTo(_x1,_y1);
 }
};
 //BA.debugLineNum = 112;BA.debugLine="x1 = cx + r2 * CosD(ang2)";
_x1 = (float) (_cx+_r2*anywheresoftware.b4a.keywords.Common.CosD(_ang2));
 //BA.debugLineNum = 113;BA.debugLine="y1 = cy + r2 * SinD(ang2)";
_y1 = (float) (_cy+_r2*anywheresoftware.b4a.keywords.Common.SinD(_ang2));
 //BA.debugLineNum = 114;BA.debugLine="p1.LineTo(x1, y1)";
_p1.LineTo(_x1,_y1);
 //BA.debugLineNum = 115;BA.debugLine="x1 = cx + r1 * CosD(ang2)";
_x1 = (float) (_cx+_r1*anywheresoftware.b4a.keywords.Common.CosD(_ang2));
 //BA.debugLineNum = 116;BA.debugLine="y1 = cy + r1 * SinD(ang2)";
_y1 = (float) (_cy+_r1*anywheresoftware.b4a.keywords.Common.SinD(_ang2));
 //BA.debugLineNum = 117;BA.debugLine="p1.LineTo(x1, y1)";
_p1.LineTo(_x1,_y1);
 //BA.debugLineNum = 118;BA.debugLine="For np = 0 To 10";
{
final int step32 = 1;
final int limit32 = (int) (10);
_np = (int) (0) ;
for (;_np <= limit32 ;_np = _np + step32 ) {
 //BA.debugLineNum = 119;BA.debugLine="x1 = cx + r1 * CosD(ang2 - inc_ang * np)";
_x1 = (float) (_cx+_r1*anywheresoftware.b4a.keywords.Common.CosD(_ang2-_inc_ang*_np));
 //BA.debugLineNum = 120;BA.debugLine="y1 = cy + r1 * SinD(ang2 - inc_ang * np)";
_y1 = (float) (_cy+_r1*anywheresoftware.b4a.keywords.Common.SinD(_ang2-_inc_ang*_np));
 //BA.debugLineNum = 121;BA.debugLine="p1.LineTo(x1, y1)";
_p1.LineTo(_x1,_y1);
 }
};
 //BA.debugLineNum = 131;BA.debugLine="If AS145 = True Then";
if (_as145==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 132;BA.debugLine="xt = cx + (r2+r1 + 5) / 2 * CosD((ang2+ang1)/2)";
_xt = (float) (_cx+(_r2+_r1+5)/(double)2*anywheresoftware.b4a.keywords.Common.CosD((_ang2+_ang1)/(double)2));
 //BA.debugLineNum = 133;BA.debugLine="yt = cy + (r2+r1 + 5) / 2 * SinD((ang2+ang1)/2)";
_yt = (float) (_cy+(_r2+_r1+5)/(double)2*anywheresoftware.b4a.keywords.Common.SinD((_ang2+_ang1)/(double)2));
 }else {
 //BA.debugLineNum = 135;BA.debugLine="If altura = 0 Then	'aleja los textos del centro";
if (_altura==0) { 
 //BA.debugLineNum = 136;BA.debugLine="xt = cx + (r2+r1 + 30) / 2 * CosD((ang2+ang1)/";
_xt = (float) (_cx+(_r2+_r1+30)/(double)2*anywheresoftware.b4a.keywords.Common.CosD((_ang2+_ang1)/(double)2));
 //BA.debugLineNum = 137;BA.debugLine="yt = cy + (r2+r1 + 30) / 2 * SinD((ang2+ang1)/";
_yt = (float) (_cy+(_r2+_r1+30)/(double)2*anywheresoftware.b4a.keywords.Common.SinD((_ang2+_ang1)/(double)2));
 }else {
 //BA.debugLineNum = 139;BA.debugLine="xt = cx + (r2+r1 + 5) / 2 * CosD((ang2+ang1)/2";
_xt = (float) (_cx+(_r2+_r1+5)/(double)2*anywheresoftware.b4a.keywords.Common.CosD((_ang2+_ang1)/(double)2));
 //BA.debugLineNum = 140;BA.debugLine="yt = cy + (r2+r1 + 5) / 2 * SinD((ang2+ang1)/2";
_yt = (float) (_cy+(_r2+_r1+5)/(double)2*anywheresoftware.b4a.keywords.Common.SinD((_ang2+_ang1)/(double)2));
 };
 };
 //BA.debugLineNum = 146;BA.debugLine="If magnitud = 0 Then";
if (_magnitud==0) { 
 //BA.debugLineNum = 147;BA.debugLine="pCan.DrawPath(p1, xui.Color_ARGB(255, 255, 255,";
_pcan.DrawPath(_p1,_xui.Color_ARGB((int) (255),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.True,(float) (1));
 }else {
 //BA.debugLineNum = 150;BA.debugLine="ranb = rango * (Brillomax - Brillomin)";
_ranb = (float) (_rango*(_brillomax-_brillomin));
 //BA.debugLineNum = 151;BA.debugLine="If CBcolor.Checked = False Then";
if (_cbcolor.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 152;BA.debugLine="magnitud = Brillomax - magnitud";
_magnitud = (float) (_brillomax-_magnitud);
 //BA.debugLineNum = 153;BA.debugLine="pCan.DrawPath(p1, xui.Color_ARGB(255, magnitud*";
_pcan.DrawPath(_p1,_xui.Color_ARGB((int) (255),(int) (_magnitud*255.0/(double)_ranb),(int) (_magnitud*255.0/(double)_ranb),(int) (_magnitud*255.0/(double)_ranb)),anywheresoftware.b4a.keywords.Common.True,(float) (1));
 }else {
 //BA.debugLineNum = 155;BA.debugLine="CargaPaletaNixNox";
_cargapaletanixnox();
 //BA.debugLineNum = 156;BA.debugLine="mpal = ((magnitud - Brillomin)*31)/ranb";
_mpal = (int) (((_magnitud-_brillomin)*31)/(double)_ranb);
 //BA.debugLineNum = 158;BA.debugLine="If CBtemper.Checked = True Then ' Las zonas mas";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 159;BA.debugLine="mpal = 31 - mpal";
_mpal = (int) (31-_mpal);
 };
 //BA.debugLineNum = 162;BA.debugLine="If mpal > 31 Then";
if (_mpal>31) { 
 //BA.debugLineNum = 163;BA.debugLine="mpal = 31";
_mpal = (int) (31);
 };
 //BA.debugLineNum = 165;BA.debugLine="If mpal < 0  Then";
if (_mpal<0) { 
 //BA.debugLineNum = 166;BA.debugLine="mpal = 0";
_mpal = (int) (0);
 };
 //BA.debugLineNum = 168;BA.debugLine="mpal = 31-mpal";
_mpal = (int) (31-_mpal);
 //BA.debugLineNum = 170;BA.debugLine="pCan.DrawPath(p1, xui.Color_ARGB(255, mR(mpal),";
_pcan.DrawPath(_p1,_xui.Color_ARGB((int) (255),_mr[_mpal],_mg[_mpal],_mb[_mpal]),anywheresoftware.b4a.keywords.Common.True,(float) (1));
 };
 };
 //BA.debugLineNum = 176;BA.debugLine="If CBtextobrillo.Checked = True Then";
if (_cbtextobrillo.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 177;BA.debugLine="If grados = 360 Then";
if (_grados==360) { 
 //BA.debugLineNum = 178;BA.debugLine="pCan.DrawText(NumberFormat( mm, 2, 2), xt+10, y";
_pcan.DrawText(anywheresoftware.b4a.keywords.Common.NumberFormat(_mm,(int) (2),(int) (2)),_xt+10,_yt,_ff,_xui.Color_Green,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }else {
 //BA.debugLineNum = 180;BA.debugLine="pCan.DrawText(NumberFormat( mm, 2, 2), xt, yt,";
_pcan.DrawText(anywheresoftware.b4a.keywords.Common.NumberFormat(_mm,(int) (2),(int) (2)),_xt,_yt,_ff,_xui.Color_Green,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 };
 };
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1018;BA.debugLine="Sub ListView1_MouseClicked (EventData As MouseEven";
 //BA.debugLineNum = 1020;BA.debugLine="FichSel = ListView1.Items.Get(ListView1.SelectedI";
_fichsel = BA.ObjectToString(_listview1.getItems().Get(_listview1.getSelectedIndex()));
 //BA.debugLineNum = 1021;BA.debugLine="If FichSel.IndexOf(\"_AS_\") >0 Then";
if (_fichsel.indexOf("_AS_")>0) { 
 //BA.debugLineNum = 1022;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 1023;BA.debugLine="If numrowreal >  138 Then";
if (_numrowreal>138) { 
 //BA.debugLineNum = 1024;BA.debugLine="PreparaSectores145";
_preparasectores145();
 //BA.debugLineNum = 1025;BA.debugLine="AS145 = True";
_as145 = anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
 //BA.debugLineNum = 1028;BA.debugLine="AS145 = False";
_as145 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1029;BA.debugLine="abrirfile(FichSel)";
_abrirfile(_fichsel);
 //BA.debugLineNum = 1030;BA.debugLine="bz";
_bz();
 };
 //BA.debugLineNum = 1033;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 1141;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 1142;BA.debugLine="FichSel = ListView1.Items.Get(ListView1.SelectedI";
_fichsel = BA.ObjectToString(_listview1.getItems().Get(_listview1.getSelectedIndex()));
 //BA.debugLineNum = 1143;BA.debugLine="If FichSel.IndexOf(\"_AS_\") >0 Then";
if (_fichsel.indexOf("_AS_")>0) { 
 //BA.debugLineNum = 1144;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 1145;BA.debugLine="If numrowreal >  138 Then";
if (_numrowreal>138) { 
 //BA.debugLineNum = 1146;BA.debugLine="PreparaSectores145";
_preparasectores145();
 //BA.debugLineNum = 1147;BA.debugLine="AS145 = True";
_as145 = anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
 //BA.debugLineNum = 1150;BA.debugLine="AS145 = False";
_as145 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1151;BA.debugLine="abrirfile(FichSel)";
_abrirfile(_fichsel);
 //BA.debugLineNum = 1152;BA.debugLine="bz";
_bz();
 };
 //BA.debugLineNum = 1155;BA.debugLine="End Sub";
return "";
}
public static String  _preparasectores() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f12 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f14 = null;
String _fich = "";
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _mpal = 0;
int _naz = 0;
int _nal = 0;
int _pp = 0;
 //BA.debugLineNum = 378;BA.debugLine="Private Sub PreparaSectores";
 //BA.debugLineNum = 381;BA.debugLine="PanelMain.RemoveAllViews ' para poder refrescar e";
_panelmain.RemoveAllViews();
 //BA.debugLineNum = 382;BA.debugLine="Dim f12 As B4XFont = xui.CreateDefaultFont(10)";
_f12 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_f12 = _xui.CreateDefaultFont((float) (10));
 //BA.debugLineNum = 383;BA.debugLine="Dim f14 As B4XFont = xui.CreateDefaultFont(12)";
_f14 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_f14 = _xui.CreateDefaultFont((float) (12));
 //BA.debugLineNum = 384;BA.debugLine="Private fich As String";
_fich = "";
 //BA.debugLineNum = 385;BA.debugLine="Dim R As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 386;BA.debugLine="Dim mpal As Int";
_mpal = 0;
 //BA.debugLineNum = 388;BA.debugLine="Can.Initialize(PanelMain)";
_can.Initialize(ba,_panelmain);
 //BA.debugLineNum = 390;BA.debugLine="R.Initialize(0,0,PanelMain.Width,PanelMain.Height";
_r.Initialize((float) (0),(float) (0),(float) (_panelmain.getWidth()),(float) (_panelmain.getHeight()));
 //BA.debugLineNum = 391;BA.debugLine="Can.DrawRect(R,xui.Color_White,True,1dip)";
_can.DrawRect(_r,_xui.Color_White,anywheresoftware.b4a.keywords.Common.True,(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1))));
 //BA.debugLineNum = 394;BA.debugLine="Lmvmax.Text = Round2( MVmax,1)";
_lmvmax.setText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmax,(int) (1))));
 //BA.debugLineNum = 395;BA.debugLine="Lmvmin.Text = Round2( MVmin,1)";
_lmvmin.setText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmin,(int) (1))));
 //BA.debugLineNum = 396;BA.debugLine="If CBauto.Checked = True Then";
if (_cbauto.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 397;BA.debugLine="Brillomax = MVmax";
_brillomax = _mvmax;
 //BA.debugLineNum = 398;BA.debugLine="Brillomin = MVmin";
_brillomin = _mvmin;
 //BA.debugLineNum = 400;BA.debugLine="Smvmax.Value = MVmax";
_smvmax.setValue(_mvmax);
 //BA.debugLineNum = 401;BA.debugLine="Smvmin.Value = MVmin";
_smvmin.setValue(_mvmin);
 //BA.debugLineNum = 402;BA.debugLine="rango =   Sbrillo.MinValue + Sbrillo.MaxValue -";
_rango = (float) (_sbrillo.getMinValue()+_sbrillo.getMaxValue()-_sbrillo.getValue());
 }else {
 //BA.debugLineNum = 404;BA.debugLine="Lmvmax.Text =Round2( Smvmax.Value,1)";
_lmvmax.setText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_smvmax.getValue(),(int) (1))));
 //BA.debugLineNum = 405;BA.debugLine="Lmvmin.Text =Round2( Smvmin.Value,1)";
_lmvmin.setText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_smvmin.getValue(),(int) (1))));
 };
 //BA.debugLineNum = 410;BA.debugLine="For naz = 0 To 11";
{
final int step22 = 1;
final int limit22 = (int) (11);
_naz = (int) (0) ;
for (;_naz <= limit22 ;_naz = _naz + step22 ) {
 //BA.debugLineNum = 411;BA.debugLine="For nal = 0 To 3";
{
final int step23 = 1;
final int limit23 = (int) (3);
_nal = (int) (0) ;
for (;_nal <= limit23 ;_nal = _nal + step23 ) {
 //BA.debugLineNum = 413;BA.debugLine="draw_sector((3-nal)*18, (naz)*30 - 105.0, mag2(";
_draw_sector((float) ((3-_nal)*18),(float) ((_naz)*30-105.0),_mag2[_nal][_naz],(float) (250),(float) (250),_can,(int) (30),(int) (18));
 }
};
 }
};
 //BA.debugLineNum = 421;BA.debugLine="For pp = 0 To 240			'pinta barra de brillos";
{
final int step27 = 1;
final int limit27 = (int) (240);
_pp = (int) (0) ;
for (;_pp <= limit27 ;_pp = _pp + step27 ) {
 //BA.debugLineNum = 422;BA.debugLine="If CBcolor.Checked = False Then";
if (_cbcolor.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 423;BA.debugLine="Can.DrawLine(pp*2+20, 5,   pp*2+20, 5,   xui.Co";
_can.DrawLine((float) (_pp*2+20),(float) (5),(float) (_pp*2+20),(float) (5),_xui.Color_ARGB((int) (250),(int) (240-_pp),(int) (240-_pp),(int) (240-_pp)),(float) (8));
 }else {
 //BA.debugLineNum = 425;BA.debugLine="mpal = 31 - (pp/8)";
_mpal = (int) (31-(_pp/(double)8));
 //BA.debugLineNum = 427;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 428;BA.debugLine="Can.DrawLine(pp*2+20, 5,   pp*2+20, 5,  xui.Co";
_can.DrawLine((float) (_pp*2+20),(float) (5),(float) (_pp*2+20),(float) (5),_xui.Color_ARGB((int) (250),_mr[_mpal],_mg[_mpal],_mb[_mpal]),(float) (8));
 }else {
 //BA.debugLineNum = 430;BA.debugLine="Can.DrawLine(pp*2+20, 5,   pp*2+20, 5,   xui.C";
_can.DrawLine((float) (_pp*2+20),(float) (5),(float) (_pp*2+20),(float) (5),_xui.Color_ARGB((int) (250),_mr[(int) (31-_mpal)],_mg[(int) (31-_mpal)],_mb[(int) (31-_mpal)]),(float) (8));
 };
 };
 }
};
 //BA.debugLineNum = 436;BA.debugLine="Can.DrawText(\"TESS P\",20, 50, f14, xui.Color_Blac";
_can.DrawText("TESS P",20,50,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 //BA.debugLineNum = 438;BA.debugLine="fich = \"TIR min: \" & Round2(TempIRmin,1) & \" ºC\"";
_fich = "TIR min: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_tempirmin,(int) (1)))+" ºC";
 //BA.debugLineNum = 439;BA.debugLine="Can.DrawText(fich, 20, 60, f12, xui.Color_Black,";
_can.DrawText(_fich,20,60,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 //BA.debugLineNum = 440;BA.debugLine="fich = \"T sen: \" & Round2( TempAmb,1) & \" ºC\"";
_fich = "T sen: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_tempamb,(int) (1)))+" ºC";
 //BA.debugLineNum = 441;BA.debugLine="Can.DrawText(fich, 20, 70, f12, xui.Color_Black,";
_can.DrawText(_fich,20,70,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 //BA.debugLineNum = 444;BA.debugLine="fich = fentrada.SubString2(0, fentrada.IndexOf(\".";
_fich = _fentrada.substring((int) (0),_fentrada.indexOf("."))+"    "+_latlongsl;
 //BA.debugLineNum = 445;BA.debugLine="Can.DrawText(fich, 250, 510, f12, xui.Color_Black";
_can.DrawText(_fich,250,510,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 448;BA.debugLine="If CBauto.Checked = True Then";
if (_cbauto.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 449;BA.debugLine="Can.DrawText( Round2(MVmax,1), 500, 20, f12, xui";
_can.DrawText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmax,(int) (1))),500,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 450;BA.debugLine="Can.DrawText( Round2(MVmin,1), 20, 20, f12, xui.";
_can.DrawText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmin,(int) (1))),20,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }else {
 //BA.debugLineNum = 452;BA.debugLine="Can.DrawText( Round2( Brillomax,1), 500, 20, f12";
_can.DrawText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_brillomax,(int) (1))),500,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 453;BA.debugLine="Can.DrawText( Round2(Brillomin,1), 20, 20, f12,";
_can.DrawText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_brillomin,(int) (1))),20,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 };
 //BA.debugLineNum = 456;BA.debugLine="Can.DrawText(\"N\", 465, 55, f14, xui.Color_Black,";
_can.DrawText("N",465,55,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 457;BA.debugLine="Can.DrawText(\"S\", 465, 75, f14, xui.Color_Black,";
_can.DrawText("S",465,75,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 458;BA.debugLine="Can.DrawText(\"E\", 475, 65, f14, xui.Color_Black,";
_can.DrawText("E",475,65,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 459;BA.debugLine="Can.DrawText(\"W\", 455, 65, f14, xui.Color_Black,";
_can.DrawText("W",455,65,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 461;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 462;BA.debugLine="Can.DrawText( \"mag/arcsec2\", 250, 20, f12, xui.C";
_can.DrawText("mag/arcsec2",250,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }else {
 //BA.debugLineNum = 464;BA.debugLine="Can.DrawText( \"Temp. IR ºC\", 250, 20, f12, xui.C";
_can.DrawText("Temp. IR ºC",250,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 };
 //BA.debugLineNum = 468;BA.debugLine="grafica = Can";
_grafica = _can;
 //BA.debugLineNum = 469;BA.debugLine="Can.Invalidate";
_can.Invalidate();
 //BA.debugLineNum = 470;BA.debugLine="Can.Release";
_can.Release();
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return "";
}
public static String  _preparasectores145() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f12 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f14 = null;
String _fich = "";
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _fila = 0;
float _rota = 0f;
int _mpal = 0;
int _naz = 0;
int _pp = 0;
 //BA.debugLineNum = 475;BA.debugLine="Private Sub PreparaSectores145";
 //BA.debugLineNum = 478;BA.debugLine="PanelMain.RemoveAllViews ' para poder refrescar e";
_panelmain.RemoveAllViews();
 //BA.debugLineNum = 479;BA.debugLine="Dim f12 As B4XFont = xui.CreateDefaultFont(10)";
_f12 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_f12 = _xui.CreateDefaultFont((float) (10));
 //BA.debugLineNum = 480;BA.debugLine="Dim f14 As B4XFont = xui.CreateDefaultFont(12)";
_f14 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_f14 = _xui.CreateDefaultFont((float) (12));
 //BA.debugLineNum = 481;BA.debugLine="Private fich As String";
_fich = "";
 //BA.debugLineNum = 482;BA.debugLine="Dim R As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 483;BA.debugLine="Dim fila As Int";
_fila = 0;
 //BA.debugLineNum = 484;BA.debugLine="Dim rota As Float";
_rota = 0f;
 //BA.debugLineNum = 485;BA.debugLine="Dim mpal As Int";
_mpal = 0;
 //BA.debugLineNum = 488;BA.debugLine="rota = 90";
_rota = (float) (90);
 //BA.debugLineNum = 489;BA.debugLine="Can.Initialize(PanelMain)";
_can.Initialize(ba,_panelmain);
 //BA.debugLineNum = 490;BA.debugLine="R.Initialize(0,0,PanelMain.Width,PanelMain.Height";
_r.Initialize((float) (0),(float) (0),(float) (_panelmain.getWidth()),(float) (_panelmain.getHeight()));
 //BA.debugLineNum = 491;BA.debugLine="Can.DrawRect(R,xui.Color_White,True,1dip)";
_can.DrawRect(_r,_xui.Color_White,anywheresoftware.b4a.keywords.Common.True,(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1))));
 //BA.debugLineNum = 499;BA.debugLine="If CBauto.Checked = True Then";
if (_cbauto.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 500;BA.debugLine="Brillomax =  MVmax";
_brillomax = _mvmax;
 //BA.debugLineNum = 501;BA.debugLine="Brillomin = MVmin";
_brillomin = _mvmin;
 //BA.debugLineNum = 502;BA.debugLine="Smvmax.Value =  MVmax";
_smvmax.setValue(_mvmax);
 //BA.debugLineNum = 503;BA.debugLine="Smvmin.Value =  MVmin";
_smvmin.setValue(_mvmin);
 //BA.debugLineNum = 504;BA.debugLine="rango =   Sbrillo.MinValue + Sbrillo.MaxValue -";
_rango = (float) (_sbrillo.getMinValue()+_sbrillo.getMaxValue()-_sbrillo.getValue());
 }else {
 };
 //BA.debugLineNum = 510;BA.debugLine="For naz = 1 To 32";
{
final int step21 = 1;
final int limit21 = (int) (32);
_naz = (int) (1) ;
for (;_naz <= limit21 ;_naz = _naz + step21 ) {
 //BA.debugLineNum = 511;BA.debugLine="fila = naz";
_fila = _naz;
 //BA.debugLineNum = 513;BA.debugLine="draw_sector(64,  naz*11.25 -(rota+11.25+11.25/2)";
_draw_sector((float) (64),(float) (_naz*11.25-(_rota+11.25+11.25/(double)2)),_magas[_fila],(float) (250),(float) (250),_can,(int) (11),(int) (8));
 }
};
 //BA.debugLineNum = 515;BA.debugLine="For naz = 1 To 28";
{
final int step25 = 1;
final int limit25 = (int) (28);
_naz = (int) (1) ;
for (;_naz <= limit25 ;_naz = _naz + step25 ) {
 //BA.debugLineNum = 516;BA.debugLine="fila = fila +1";
_fila = (int) (_fila+1);
 //BA.debugLineNum = 517;BA.debugLine="draw_sector(56,  naz*12.86 -(rota+12.86+12.86/2)";
_draw_sector((float) (56),(float) (_naz*12.86-(_rota+12.86+12.86/(double)2)),_magas[_fila],(float) (250),(float) (250),_can,(int) (12),(int) (8));
 }
};
 //BA.debugLineNum = 519;BA.debugLine="For naz = 1 To 24";
{
final int step29 = 1;
final int limit29 = (int) (24);
_naz = (int) (1) ;
for (;_naz <= limit29 ;_naz = _naz + step29 ) {
 //BA.debugLineNum = 520;BA.debugLine="fila = fila +1";
_fila = (int) (_fila+1);
 //BA.debugLineNum = 521;BA.debugLine="draw_sector(48,  naz*15 -(rota+15+15/2),   MagAS";
_draw_sector((float) (48),(float) (_naz*15-(_rota+15+15/(double)2)),_magas[_fila],(float) (250),(float) (250),_can,(int) (15),(int) (8));
 }
};
 //BA.debugLineNum = 523;BA.debugLine="For naz = 1 To 20";
{
final int step33 = 1;
final int limit33 = (int) (20);
_naz = (int) (1) ;
for (;_naz <= limit33 ;_naz = _naz + step33 ) {
 //BA.debugLineNum = 524;BA.debugLine="fila = fila +1";
_fila = (int) (_fila+1);
 //BA.debugLineNum = 525;BA.debugLine="draw_sector(40,  naz*18 -(rota+18+18/2),   MagAS";
_draw_sector((float) (40),(float) (_naz*18-(_rota+18+18/(double)2)),_magas[_fila],(float) (250),(float) (250),_can,(int) (18),(int) (8));
 }
};
 //BA.debugLineNum = 527;BA.debugLine="For naz = 1 To 16";
{
final int step37 = 1;
final int limit37 = (int) (16);
_naz = (int) (1) ;
for (;_naz <= limit37 ;_naz = _naz + step37 ) {
 //BA.debugLineNum = 528;BA.debugLine="fila = fila +1";
_fila = (int) (_fila+1);
 //BA.debugLineNum = 529;BA.debugLine="draw_sector(32,  naz*22.5 -(rota+22.5+22.5/2),";
_draw_sector((float) (32),(float) (_naz*22.5-(_rota+22.5+22.5/(double)2)),_magas[_fila],(float) (250),(float) (250),_can,(int) (22),(int) (8));
 }
};
 //BA.debugLineNum = 531;BA.debugLine="For naz = 1 To 12";
{
final int step41 = 1;
final int limit41 = (int) (12);
_naz = (int) (1) ;
for (;_naz <= limit41 ;_naz = _naz + step41 ) {
 //BA.debugLineNum = 532;BA.debugLine="fila = fila +1";
_fila = (int) (_fila+1);
 //BA.debugLineNum = 533;BA.debugLine="draw_sector(24,  naz*30 -(rota+30+30/2),   MagAS";
_draw_sector((float) (24),(float) (_naz*30-(_rota+30+30/(double)2)),_magas[_fila],(float) (250),(float) (250),_can,(int) (30),(int) (8));
 }
};
 //BA.debugLineNum = 535;BA.debugLine="For naz = 1 To 8";
{
final int step45 = 1;
final int limit45 = (int) (8);
_naz = (int) (1) ;
for (;_naz <= limit45 ;_naz = _naz + step45 ) {
 //BA.debugLineNum = 536;BA.debugLine="fila = fila +1";
_fila = (int) (_fila+1);
 //BA.debugLineNum = 537;BA.debugLine="draw_sector(16,  naz*45 -(rota+45+45/2),   MagAS";
_draw_sector((float) (16),(float) (_naz*45-(_rota+45+45/(double)2)),_magas[_fila],(float) (250),(float) (250),_can,(int) (45),(int) (8));
 }
};
 //BA.debugLineNum = 539;BA.debugLine="For naz = 1 To 4";
{
final int step49 = 1;
final int limit49 = (int) (4);
_naz = (int) (1) ;
for (;_naz <= limit49 ;_naz = _naz + step49 ) {
 //BA.debugLineNum = 540;BA.debugLine="fila = fila +1";
_fila = (int) (_fila+1);
 //BA.debugLineNum = 541;BA.debugLine="draw_sector(8,  naz*90 -(rota+90+90/2),   MagAS(";
_draw_sector((float) (8),(float) (_naz*90-(_rota+90+90/(double)2)),_magas[_fila],(float) (250),(float) (250),_can,(int) (90),(int) (8));
 }
};
 //BA.debugLineNum = 543;BA.debugLine="fila = fila +1";
_fila = (int) (_fila+1);
 //BA.debugLineNum = 544;BA.debugLine="draw_sector(0,  0 ,   MagAS(fila), 250, 250, Can,";
_draw_sector((float) (0),(float) (0),_magas[_fila],(float) (250),(float) (250),_can,(int) (360),(int) (8));
 //BA.debugLineNum = 547;BA.debugLine="For pp = 0 To 240		' Pinta barra de paleta";
{
final int step55 = 1;
final int limit55 = (int) (240);
_pp = (int) (0) ;
for (;_pp <= limit55 ;_pp = _pp + step55 ) {
 //BA.debugLineNum = 548;BA.debugLine="If CBcolor.Checked = False Then";
if (_cbcolor.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 549;BA.debugLine="Can.DrawLine(pp*2+20, 5,   pp*2+20, 5,   xui.Co";
_can.DrawLine((float) (_pp*2+20),(float) (5),(float) (_pp*2+20),(float) (5),_xui.Color_ARGB((int) (250),(int) (240-_pp),(int) (240-_pp),(int) (240-_pp)),(float) (8));
 }else {
 //BA.debugLineNum = 551;BA.debugLine="mpal = 31-( pp/8)";
_mpal = (int) (31-(_pp/(double)8));
 //BA.debugLineNum = 553;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 554;BA.debugLine="Can.DrawLine(pp*2+20, 5,   pp*2+20, 5,  xui.Co";
_can.DrawLine((float) (_pp*2+20),(float) (5),(float) (_pp*2+20),(float) (5),_xui.Color_ARGB((int) (250),_mr[_mpal],_mg[_mpal],_mb[_mpal]),(float) (8));
 }else {
 //BA.debugLineNum = 556;BA.debugLine="Can.DrawLine(pp*2+20, 5,   pp*2+20, 5,   xui.C";
_can.DrawLine((float) (_pp*2+20),(float) (5),(float) (_pp*2+20),(float) (5),_xui.Color_ARGB((int) (250),_mr[(int) (31-_mpal)],_mg[(int) (31-_mpal)],_mb[(int) (31-_mpal)]),(float) (8));
 };
 };
 }
};
 //BA.debugLineNum = 568;BA.debugLine="Can.DrawText(\"Tess Auto Scan \",20, 50, f14, xui.C";
_can.DrawText("Tess Auto Scan ",20,50,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 //BA.debugLineNum = 570;BA.debugLine="fich = \"TIR min: \" & Round2(TempIRmin,1) & \" ºC\"";
_fich = "TIR min: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_tempirmin,(int) (1)))+" ºC";
 //BA.debugLineNum = 571;BA.debugLine="Can.DrawText(fich, 20, 60, f12, xui.Color_Black,";
_can.DrawText(_fich,20,60,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 //BA.debugLineNum = 572;BA.debugLine="fich = \"T sen: \" & Round2( TempAmb,1) & \" ºC\"";
_fich = "T sen: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_tempamb,(int) (1)))+" ºC";
 //BA.debugLineNum = 573;BA.debugLine="Can.DrawText(fich, 20, 70, f12, xui.Color_Black,";
_can.DrawText(_fich,20,70,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 //BA.debugLineNum = 575;BA.debugLine="Can.DrawText(\"N\", 465, 55, f14, xui.Color_Black,";
_can.DrawText("N",465,55,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 576;BA.debugLine="Can.DrawText(\"S\", 465, 75, f14, xui.Color_Black,";
_can.DrawText("S",465,75,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 577;BA.debugLine="Can.DrawText(\"E\", 475, 65, f14, xui.Color_Black,";
_can.DrawText("E",475,65,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 578;BA.debugLine="Can.DrawText(\"W\", 455, 65, f14, xui.Color_Black,";
_can.DrawText("W",455,65,_f14,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 581;BA.debugLine="fich = fentrada.SubString2(0, fentrada.IndexOf(\".";
_fich = _fentrada.substring((int) (0),_fentrada.indexOf("."))+"    "+_latlongsl;
 //BA.debugLineNum = 582;BA.debugLine="Can.DrawText(fich, 250, 510, f12, xui.Color_Black";
_can.DrawText(_fich,250,510,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 583;BA.debugLine="If CBauto.Checked = True Then";
if (_cbauto.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 584;BA.debugLine="Can.DrawText( Round2(MVmax,1), 500, 20, f12, xui";
_can.DrawText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmax,(int) (1))),500,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 585;BA.debugLine="Can.DrawText( Round2(MVmin,1), 20, 20, f12, xui.";
_can.DrawText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_mvmin,(int) (1))),20,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }else {
 //BA.debugLineNum = 587;BA.debugLine="Can.DrawText( Round2( Brillomax,1), 500, 20, f12";
_can.DrawText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_brillomax,(int) (1))),500,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 588;BA.debugLine="Can.DrawText( Round2(Brillomin,1), 20, 20, f12,";
_can.DrawText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_brillomin,(int) (1))),20,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 };
 //BA.debugLineNum = 591;BA.debugLine="If CBtemper.Checked = False Then";
if (_cbtemper.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 592;BA.debugLine="Can.DrawText( \"mag/arcsec2\", 250, 20, f12, xui.C";
_can.DrawText("mag/arcsec2",250,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }else {
 //BA.debugLineNum = 594;BA.debugLine="Can.DrawText( \"Temp. IR ºC\", 250, 20, f12, xui.C";
_can.DrawText("Temp. IR ºC",250,20,_f12,_xui.Color_Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 };
 //BA.debugLineNum = 598;BA.debugLine="grafica = Can";
_grafica = _can;
 //BA.debugLineNum = 599;BA.debugLine="Can.Invalidate";
_can.Invalidate();
 //BA.debugLineNum = 600;BA.debugLine="Can.Release";
_can.Release();
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 9;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 10;BA.debugLine="Private PanelMain As B4XView";
_panelmain = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="Private mag2(4, 12) As Float";
_mag2 = new float[(int) (4)][];
{
int d0 = _mag2.length;
int d1 = (int) (12);
for (int i0 = 0;i0 < d0;i0++) {
_mag2[i0] = new float[d1];
}
}
;
 //BA.debugLineNum = 13;BA.debugLine="Private ancho As Int = 10";
_ancho = (int) (10);
 //BA.debugLineNum = 14;BA.debugLine="Private alto As Int = 8";
_alto = (int) (8);
 //BA.debugLineNum = 15;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Bshowfiles As Button";
_bshowfiles = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Lpiepag As Label";
_lpiepag = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Bsavebmp As Button";
_bsavebmp = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private grafica As B4XCanvas";
_grafica = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 20;BA.debugLine="Private LatLongSl As String";
_latlongsl = "";
 //BA.debugLineNum = 21;BA.debugLine="Private fentrada As String";
_fentrada = "";
 //BA.debugLineNum = 22;BA.debugLine="Private  difacimut As Int";
_difacimut = 0;
 //BA.debugLineNum = 23;BA.debugLine="Private Sbrillo As Slider";
_sbrillo = new anywheresoftware.b4j.objects.SliderWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private FichSel As String";
_fichsel = "";
 //BA.debugLineNum = 25;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Brillomax, Brillomin As Float";
_brillomax = 0f;
_brillomin = 0f;
 //BA.debugLineNum = 27;BA.debugLine="Private MVmin, MVmax As Float";
_mvmin = 0f;
_mvmax = 0f;
 //BA.debugLineNum = 28;BA.debugLine="Dim rango As Float";
_rango = 0f;
 //BA.debugLineNum = 30;BA.debugLine="Private Smvmax As Slider";
_smvmax = new anywheresoftware.b4j.objects.SliderWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Smvmin As Slider";
_smvmin = new anywheresoftware.b4j.objects.SliderWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Lmvmin As Label";
_lmvmin = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Dim Can As B4XCanvas";
_can = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 34;BA.debugLine="Private MagAS(146) As Float";
_magas = new float[(int) (146)];
;
 //BA.debugLineNum = 35;BA.debugLine="Private AS145 As Boolean";
_as145 = false;
 //BA.debugLineNum = 37;BA.debugLine="Private Lmvmax As Label";
_lmvmax = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private CBauto As CheckBox";
_cbauto = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private mR(32) As Int";
_mr = new int[(int) (32)];
;
 //BA.debugLineNum = 43;BA.debugLine="Private mG(32) As Int";
_mg = new int[(int) (32)];
;
 //BA.debugLineNum = 44;BA.debugLine="Private mB(32) As Int";
_mb = new int[(int) (32)];
;
 //BA.debugLineNum = 45;BA.debugLine="Private CBcolor As CheckBox";
_cbcolor = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Lcontras As Label";
_lcontras = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private Lati, Longi, HoraSl As String";
_lati = "";
_longi = "";
_horasl = "";
 //BA.debugLineNum = 49;BA.debugLine="Private TempIRmin, TempAmb As Float";
_tempirmin = 0f;
_tempamb = 0f;
 //BA.debugLineNum = 51;BA.debugLine="Private CBtemper As CheckBox";
_cbtemper = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private CBtextobrillo As CheckBox";
_cbtextobrillo = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private numrowreal As Int";
_numrowreal = 0;
 //BA.debugLineNum = 54;BA.debugLine="Private Bmas As Button";
_bmas = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private Bmenos As Button";
_bmenos = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private BMmenos As Button";
_bmmenos = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private BMmas As Button";
_bmmas = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _sbrillo_valuechange(double _value) throws Exception{
 //BA.debugLineNum = 972;BA.debugLine="Sub Sbrillo_ValueChange (Value As Double) 					'Co";
 //BA.debugLineNum = 973;BA.debugLine="rango =   Sbrillo.MinValue + Sbrillo.MaxValue - V";
_rango = (float) (_sbrillo.getMinValue()+_sbrillo.getMaxValue()-_value);
 //BA.debugLineNum = 974;BA.debugLine="Lcontras.Text = Round2(2- rango,1)";
_lcontras.setText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(2-_rango,(int) (1))));
 //BA.debugLineNum = 976;BA.debugLine="If AS145 = True Then";
if (_as145==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 977;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 978;BA.debugLine="PreparaSectores145";
_preparasectores145();
 }else {
 //BA.debugLineNum = 980;BA.debugLine="PreparaSectores";
_preparasectores();
 };
 //BA.debugLineNum = 983;BA.debugLine="End Sub";
return "";
}
public static String  _smvmax_valuechange(double _value) throws Exception{
 //BA.debugLineNum = 985;BA.debugLine="Sub Smvmax_ValueChange (Value As Double)";
 //BA.debugLineNum = 987;BA.debugLine="Lmvmax.Text =\"H: \" &  Round2( Value,2)";
_lmvmax.setText("H: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_value,(int) (2))));
 //BA.debugLineNum = 988;BA.debugLine="Brillomax = Value";
_brillomax = (float) (_value);
 //BA.debugLineNum = 989;BA.debugLine="If AS145 = True Then";
if (_as145==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 990;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 991;BA.debugLine="PreparaSectores145";
_preparasectores145();
 }else {
 //BA.debugLineNum = 993;BA.debugLine="PreparaSectores";
_preparasectores();
 };
 //BA.debugLineNum = 999;BA.debugLine="End Sub";
return "";
}
public static String  _smvmin_valuechange(double _value) throws Exception{
 //BA.debugLineNum = 1001;BA.debugLine="Sub Smvmin_ValueChange (Value As Double)";
 //BA.debugLineNum = 1003;BA.debugLine="Lmvmin.Text =\"L: \" &  Round2( Value, 2)";
_lmvmin.setText("L: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_value,(int) (2))));
 //BA.debugLineNum = 1004;BA.debugLine="Brillomin = Value";
_brillomin = (float) (_value);
 //BA.debugLineNum = 1005;BA.debugLine="If AS145 = True Then";
if (_as145==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1006;BA.debugLine="abrirfile145(FichSel)";
_abrirfile145(_fichsel);
 //BA.debugLineNum = 1007;BA.debugLine="PreparaSectores145";
_preparasectores145();
 }else {
 //BA.debugLineNum = 1009;BA.debugLine="PreparaSectores";
_preparasectores();
 };
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return "";
}
}
