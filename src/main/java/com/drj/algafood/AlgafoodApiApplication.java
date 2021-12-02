package com.drj.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgafoodApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgafoodApiApplication.class, args);
    }

//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
//                .web(WebApplicationType.NONE)
//                .run(args);
//
//        CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
//
//        List<Cidade> todasCidades = cidadeRepository.listar();
//
//        for (Cidade cidade : todasCidades) {
//            System.out.printf("%s - %s\n", cidade.getNome(), cidade.getEstado().getNome());
//        }
//    }

//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
//                .web(WebApplicationType.NONE)
//                .run(args);
//
//        FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
//
//        List<FormaPagamento> todasFormasPagamentos = formaPagamentoRepository.listar();
//
//        for (FormaPagamento formaPagamento : todasFormasPagamentos) {
//            System.out.println(formaPagamento.getDescricao());
//        }
//    }

}
