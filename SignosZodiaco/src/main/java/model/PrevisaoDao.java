package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrevisaoDao {
    private static List<String> Previsoes = new ArrayList<>();
    private static List<String> Bixo = new ArrayList<>();
    public UsuarioDao usuarioDao = new UsuarioDao();
    public PrevisaoDao(){
        criarPrevisoes();
        criarBixo();
    }

    public void criarPrevisoes(){
        Previsoes.add("seu dia será lindo, cheio de alegria.");
        Previsoes.add("você conhecerá uma pessoa nova que pode mudar sua vida");
        Previsoes.add("se trabalha, seu chefe te dará uma promoção.Caso esteja procurando um emprego, será contratatado hoje.");
        Previsoes.add("em toda sua vida você esperou por essa chance de realizar seu sonhos, arrisque tudo agora e será feliz para sempre.");
        Previsoes.add("é bem capaz que encontre dinheiro na rua hoje.");
        Previsoes.add("sua sorte está melhor, pode jogar no \"jogo do bicho\"");
        Previsoes.add("se está com algum problema de relacionamento, talvez seja a hora de dar um tempo e respirar novos ares.");
        Previsoes.add("se tem algo te preocupando, lembre-se: \"Ocupado ou desocupado, mas nunca preocupado!\"");
        Previsoes.add("use guarda-chuvas emocionais, pois hoje seu dia será invadido por problemas.");
        Previsoes.add("hoje será um péssimo dia, alguém importante precisará de ajuda e você não estará disposto");
        Previsoes.add("se tem algo te preocupando, lembre-se: \"Ocupado ou desocupado, mas nunca preocupado!\"");
        Previsoes.add("use guarda-chuvas emocionais, pois hoje seu dia será invadido por problemas.");
        Previsoes.add("hoje será um péssimo dia, alguém importante precisará de ajuda e você não estará disposto");
        Previsoes.add("você não poderá sair de casa hoje, algo ruim pode acontecer na rua.");
        Previsoes.add("se está com problemas financeiros, respire. Tudo dará errado. Use seu tempo procurando aceitar.");
    }

    public void criarBixo(){
        Bixo.add("Avestruz");
        Bixo.add("Águia");
        Bixo.add("Burro");
        Bixo.add("Borboleta");
        Bixo.add("Cachorro");
        Bixo.add("Cabra");
        Bixo.add("Carneiro");
        Bixo.add("Camelo");
        Bixo.add("Cobra");
        Bixo.add("Coelho");
        Bixo.add("Cavalo");
        Bixo.add("Elefante");
        Bixo.add("Galo");
        Bixo.add("Gato");
        Bixo.add("Jacaré");
        Bixo.add("Leão");
        Bixo.add("Macaco");
        Bixo.add("Porco");
        Bixo.add("Pavão");
        Bixo.add("Peru");
        Bixo.add("Touro");
        Bixo.add("Tigre");
        Bixo.add("Urso");
        Bixo.add("Veado");
        Bixo.add("Vaca");
    }

    public String sortearPrevisao(String nome){
        Random rd = new Random();
        int rand = rd.nextInt(Previsoes.size()-1);
        int randBixo = rd.nextInt(Bixo.size()-1);

        Usuario usuario =  usuarioDao.checkUser(nome);
        if (usuario == null){
            return "Usuario Invalido faça cadastro!";
        }if(usuarioDao.checkPremium(usuario)){
            return usuario.getNome() + "(" + usuario.Signo + ")" + " " + Previsoes.get(rand) +
                    "\n Seu animal da sorte é: " + Bixo.get(randBixo);
        }
        return usuario.getNome() + " " + Previsoes.get(rand);
    }
}
