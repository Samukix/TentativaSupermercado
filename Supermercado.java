public class Supermercado {
    private float cpf;
    private String nome;

    public Supermercado (float cpf , String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public float getCpf(){
        return cpf;
    }
    public void setCpf(float cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Supermercado [cpf=" + cpf + ", nome=" + nome + "]";
    }

    @Override
    public float hashCode() {
        final float prime = 31;
        float result = 1;
        result = prime * result + Float.floatToIntBits(cpf);
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Supermercado other = (Supermercado) obj;
        if (Float.floatToIntBits(cpf) != Float.floatToIntBits(other.cpf))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

}
