package Design;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Design {
    
    // resolução tela pc
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private Dimension d = tk.getScreenSize();

    private int largura = d.width;
    private int altura = d.height;
    
    private Color corFundo1 = new Color(238, 247, 242);
    private Color corFundo2 = new Color(3, 152, 158);
    private Color corFundo3 = new Color(255, 255, 255);
    
    private Color corTituloTabela = new Color(3,102,116);
    private Color corBotaoSairCancelarVoltar = new Color(129,88,119);
    private Color corBotaoSalvar = new Color(5,180,145);
    private Color corCampoTexto = new Color(207,220,212);
    
    private Color corLetra1 = new Color(255,255,255);
     
   
    
    
    public String FormataFloat(float num){
        NumberFormat formatter = new DecimalFormat("0.00");
        return (formatter.format(num));
    }

    public int CentralizarLargura(int tamanhoObjeto, int posicao, int muti) { 
        return (largura/posicao)*muti - (tamanhoObjeto/2);
    }
    
    public int CentralizarAltura(int tamanhoObjeto, int posicao, int muti) { 
        return (altura/posicao)* muti - (tamanhoObjeto/2);
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Color getCorFundo1() {
        return corFundo1;
    }

    public void setCorFundo1(Color corFundo1) {
        this.corFundo1 = corFundo1;
    }

    public Color getCorFundo2() {
        return corFundo2;
    }

    public void setCorFundo2(Color corFundo2) {
        this.corFundo2 = corFundo2;
    }

    public Color getCorFundo3() {
        return corFundo3;
    }

    public void setCorFundo3(Color corFundo3) {
        this.corFundo3 = corFundo3;
    }

    public Color getCorTituloTabela() {
        return corTituloTabela;
    }

    public void setCorTituloTabela(Color corTituloTabela) {
        this.corTituloTabela = corTituloTabela;
    }

    public Color getCorBotaoSairCancelarVoltar() {
        return corBotaoSairCancelarVoltar;
    }

    public void setCorBotaoSairCancelarVoltar(Color corBotaoSairCancelarVoltar) {
        this.corBotaoSairCancelarVoltar = corBotaoSairCancelarVoltar;
    }

    public Color getCorBotaoSalvar() {
        return corBotaoSalvar;
    }

    public void setCorBotaoSalvar(Color corBotaoSalvar) {
        this.corBotaoSalvar = corBotaoSalvar;
    }

    public Color getCorLetra1() {
        return corLetra1;
    }

    public void setCorLetra1(Color corLetra1) {
        this.corLetra1 = corLetra1;
    }

    public Color getCorCampoTexto() {
        return corCampoTexto;
    }

    public void setCorCampoTexto(Color corCampoTexto) {
        this.corCampoTexto = corCampoTexto;
    }

   
    
    
}
