public class Cliente {
    // Atributos
    private int id_Cliente;
    private String nome_Cliente;
    private Tipo_Documento old_tipo_Documento; 
    private int cod_Documento;
    private int Rg_Cliente;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String CEP;
    private int DDD_res;
    private String tel_res;
    private int DDD_com;
    private String tel_com;
    private int DDD_cel;
    private String tel_res;
    private int E_mail;
    private int Status_cli;
    private Date Data_cad_cli;
    }


    // Getters e Setters
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public TipoDocumento getTipoDocumento() {
        return oldtipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento oldtipoDocumento) {
        this.oldtipoDocumento = tipoDocumento;
    }

    public int getcodDocumento() {
        return codDocumento;
    }
    public void setcodDocumento(int codDocumento) {
        this.codDocumento = codDocumento;
    }

    public int getRgcliente() {
        return codDocumento;
    }
    public void Rgclient(int RgCliente) {
        this.RgCliente = Rgcliente;
    }

    public String getendereço() {
        return endereço;
    }
    public void setendereço(String endereço) {
        this.endereço = endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade; }
 
    void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getDDD_res() {
        return DDD_res;
    }

    public void setDDD_res(int DDD_res) {
        this.DDD_res = DDD_res;
    }

    public String getTel_res() {
        return tel_res;
    }

    public void setTel_res(String tel_res) {
        this.tel_res = tel_res;
    }

    public int getDDD_com() {
        return DDD_com;
    }

    public void setDDD_com(int DDD_com) {
        this.DDD_com = DDD_com;
    }

    public String getTel_com() {
        return tel_com;
    }

    public void setTel_com(String tel_com) {
        this.tel_com = tel_com;
    }

    public int getDDD_cel() {
        return DDD_cel;
    }

    public void setDDD_cel(int DDD_cel) {
        this.DDD_cel = DDD_cel;
    }

    public String getTel_cel() {
        return tel_cel;
    }

    public void setTel_cel(String tel_cel) {
        this.tel_cel = tel_cel;
    }

    public int getE_mail() {
        return E_mail;
    }

    public void setE_mail(int E_mail) {
        this.E_mail = E_mail;
    }

    public int getStatus_cli() {
        return Status_cli;
    }

    public void setStatus_cli(int Status_cli) {
        this.Status_cli = Status_cli;
    }

    public Date getData_cad_cli() {
        return Data_cad_cli;
    }

    public void setData_cad_cli(Date Data_cad_cli) {
        this.Data_cad_cli = Data_cad_cli;
    }
    
    
      // Métodos de negócio
      public void Efetua_pedido() {
        System.out.println("pedido efetuado com sucesso")
    }

    public void Efetua_Pagamento() {
        System.out.println("pagamento realizado com sucesso")
    }

    public void Cadastra_cliente() {
        System.out.println("cliente cadastrado com sucesso")
    }
    public void Exclui_cliente() {
        System.out.println("cliente excluido com sucesso")
    }

    public void Altera_Dados() {
        System.out.println("dados alterados com sucesso")
    }

    public void Consulta_Dados() {
        System.out.println("consultando dados do cliente")
    }
