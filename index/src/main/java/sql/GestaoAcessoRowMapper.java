package sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class GestaoAcessoRowMapper implements RowMapper<GestaoAcesso>{
    
    @Override
    public GestaoAcesso mapRow(ResultSet rs, int rowNum) throws SQLException {
        GestaoAcesso gestaoAcesso = new GestaoAcesso();
        gestaoAcesso.setIdGestaoAcesso(rs.getInt("id_gestao_acesso"));
        gestaoAcesso.setEmail(rs.getString("email"));
        gestaoAcesso.setSenha(rs.getString("senha"));
        gestaoAcesso.setNivel(rs.getInt("nivel"));
        return gestaoAcesso;
    }
}
