/******************************************************
  
Autor 1: Xxxxx
Autor 2: Yyyyy
  
******************************************************/
package josephus;
 
public class JosephusXY {
     
    protected NodeJosephus primeiroNo;
     
     
    public JosephusXY() {
 
    }  
 
     /**
     * Remove sucessivamente os soldados pela regra do jogo, e retorna o nome do soldado a fugir
     * @param primeiro Nome do soldado pelo qual o jogo começa
     * @return Nome do vencedor
     */
    public String soldadoAEscapar(String primeiro) {
     NodeJosephus and = primeiroNo;
     NodeJosephus aux;
        int i = 0;
        int n=0;
        
        while(and.getNome() != primeiro){
            
            and=and.getProximo();
            i++;
        }
        n=and.getN();
        aux=and.getProximo();
        
        removeVal(and.getNome());
        and=aux;
        while(this.size()!=1){
            for (int j = 0; j < n-1; j++) {
                and = and.getProximo();
                
            }
            n=and.getN();
             n=and.getN();
        aux=and.getProximo();
            System.out.println(and.getNome()+" dead");
        removeVal(and.getNome());
        and=aux;
            
        }
        
        
        return and.getNome();
    }
  
    /**
     * Insere um valor na lista
     * @param n Número de passos
     * @param nome Nome do soldado
     */
    public void add(int n, String nome) { 
         if(primeiroNo==null){
            primeiroNo=new NodeJosephus();
            
            
            primeiroNo.setN(n);
            primeiroNo.setNome(nome);
            primeiroNo.setProximo(primeiroNo);
         }
        else{
            
            NodeJosephus and = primeiroNo;
                    while(and.getProximo()!= primeiroNo){
                        and=and.getProximo();
                    }
                    NodeJosephus a = new NodeJosephus();
                    a.setN(n);
                    a.setNome(nome);
                    and.setProximo(a);
                    a.setProximo(primeiroNo);
            
           
           
            
            
        }
        
        
        return;
        
        
    }
     
    /**
     * Remove o elemento contido na lista na posição pedida
     * @param posicao Posição do elemento a ser excluído
     * @return Sucesso da operação
     */
    public int removePos(int posicao) { 
        if(posicao>size()-1) {
            System.out.println("erro");
            return -1;
        }
        NodeJosephus and=primeiroNo;
        for (int i = 0; i < posicao-1; i++) {
            and=and.getProximo();
            
        }
        and.setProximo(and.getProximo().getProximo());
        return 0;
        
        
    }
     
    /**
     * Retorna o valor contido na lista na posição pedida
     * @param posicao Posição do elemento desejado
     * @return Valor contido na posição
     */
    public String get(int posicao) { 
         if(posicao>size()-1) {
        return "-1";
        }
        NodeJosephus and=primeiroNo;
        for (int i = 0; i < posicao; i++) {
            and=and.getProximo();
            
        }
        return and.getNome();
    }
     
    
    /**
     * Conta o número de elementos na lista e retorna este valor
     * @return Número de elementos na lista
     */
    public int size() { 
         NodeJosephus and=primeiroNo;
        int i=0;
        if(and.getProximo()==and){
            return 1;
        }
        and=and.getProximo();
        i++;
        while(!and.equals(primeiroNo)){
          and=and.getProximo();
        i++;
        }
        
        return i;
      
    }
     
    /**
     * Converte a lista em uma string no formato <->2<->3<->1<->5<->4<->
     * @return 
     */
    public String toString() { 
       String s="";
        NodeJosephus and=primeiroNo;
        s="<->"+primeiroNo.getN();
        and=and.getProximo();
         while(!and.equals(primeiroNo)){
             s = s + "<->"+and.getN();
             and=and.getProximo();
        
        }
         return s+"<->";
    }
  
    /**
     * Remove a primeira ocorrência de um valor na lista
     * @param nome Nome do soldado a ser removido
     * @return Sucesso da operação
     */
    public int removeVal(String nome) { 
        NodeJosephus and = primeiroNo;
        int i = 0;
        
        while(and.getNome() != nome){
            
            and=and.getProximo();
            i++;
        }
        removePos(i);
        return 0;
    }
     
    /**
     * Retorna o nome dos autores da classe
     * @return "Nome 1 / Nome 2"
     */
    public String getAutores() {
        return "Xxxxx / Yyyyy";
    }
  
    
    protected class NodeJosephus {
    
        private int n;
    private String nome;
        private NodeJosephus proximo;
 
 
        public int getN() {
            return n;
        }
 
        public void setN(int n) {
            this.n = n;
        }
 
        public String getNome() {
            return nome;
        }
 
        public void setNome(String nome) {
            this.nome = nome;
        }
  
        public NodeJosephus getProximo() {
            return proximo;
        }
  
        public void setProximo(NodeJosephus proximo) {
            this.proximo = proximo;
        }
          
   }
     
}