package com.pcwk.ehr.ed11;


import java.util.List;

import com.pcwk.ehr.cmn.DTO;
import com.pcwk.ehr.cmn.PLog;

public interface WorkDiv<T> extends PLog {
	
	/**
	 * 목록조회
	 * @param search
	 * @return
	 */
	public List<T> doRetrieve(T search);
	
	/**
	 * 단건 저장
	 * @param param
	 * @return 성공(1)/실패(0)
	 */
	public int doSave(T param);
	
	/**
	 * 단건 수정
	 * @param param
	 * @return 성공(1)/실패(0)
	 */
	public int doUpdate(T param);
	
	/**
	 * 단건 삭제
	 * @param param
	 * @return 성공(1)/실패(0)
	 */
	public int doDelete(T param);
	
	/**
	 * 단건조회
	 * @param param
	 * @return 성공(1)/실패(0)
	 */
	public T doSelectOne(T param);
	
	/**
	 * 파일에 저장
	 * @param param
	 * @return 성공(1이상)/실패(0)
	 */
	public int doSaveFile(T param);
	
	/**
	 * 파일에서 읽어 오기
	 * @param param
	 * @return 성공(1이상)/실패(0)
	 */
	public int doReadFile(T param);
}
