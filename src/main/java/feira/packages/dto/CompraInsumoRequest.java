package feira.packages.dto;

public class CompraInsumoRequest {

    private String descricao;
    private double valorTotal;
    private Long insumoId;

    public CompraInsumoRequest() {}

    public CompraInsumoRequest(String descricao, double valorTotal, Long insumoId) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.insumoId = insumoId;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public Long getInsumoId() { return insumoId; }
    public void setInsumoId(Long insumoId) { this.insumoId = insumoId; }
}