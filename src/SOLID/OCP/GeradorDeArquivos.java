package SOLID.OCP;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeArquivos {
  public void GerarArquivos(ArrayList<Arquivo> arquivos) {
    for(Arquivo arquivo : arquivos) {
      arquivo.Gerar();
    }
  }
}
