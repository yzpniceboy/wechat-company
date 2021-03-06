package cc.pp.weixin.custom.replay.service;

import cc.pp.weixin.domain.custom.reply.CustomReply;

/**
 * 自定义回复服务类
 * @author wgybzb
 * @since  2013-04-26
 */
public interface CustomReplyService {
	/**
	 * 查询当前用户的自定义回复
	 * @param uid	       用户的Id
	 */
	CustomReply getCustomReply(long uid);

	/**
	 * 根据用户输入的内容，匹配查询到的自定义回复
	 * @param uid	       用户的Id
	 * @param content     用户输入内容
	 */
	CustomReply getMatchedCustomReply(long uid,String content);

	/**
	 * 根据用户输入的内容，匹配查询到的自定义回复
	 * @param uid	       用户的Id
	 * @param content     用户输入内容
	 */
	CustomReply getMatchedCustomReply(int uid,String content);
}
