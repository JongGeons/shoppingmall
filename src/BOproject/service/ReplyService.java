package BOproject.service;

import java.sql.SQLException;
import java.util.List;

import BOproject.model.ReplyVO;


public interface ReplyService {
	

	public abstract List<ReplyVO> listReply() throws SQLException;
	
	public abstract ReplyVO getReply(int rid) throws SQLException;
	
	public abstract int registReply(ReplyVO Reply) throws SQLException;
	
	public abstract int modifyReply(ReplyVO Reply) throws SQLException;
	
	public abstract int removeReply(int rid) throws SQLException;

}
