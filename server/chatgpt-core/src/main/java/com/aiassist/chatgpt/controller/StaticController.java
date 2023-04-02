package com.aiassist.chatgpt.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description
 * @Author Peter Ke
 * @Date $ $
 */
@RestController
@RequestMapping("/biz/web-config")
@Slf4j
public class StaticController {

    @GetMapping("/feishu-config")
    public String get(@RequestParam("key") String key){
        //response.addHeader("Access-Control-Allow-Origin", "*");
        log.info("收到参数key={}",key);
        String text="";
        if(key.equals("chat-gpt-qrcode"))
        {
            text="{\"data\":[{\"recordId\":\"rec0P14LOK\",\"fields\":{\"二维码\":\"https://res.pandateacher.com/564WU6CW1676532254170.png\",\"企微号\":\"吴枫老师\uD83C\uDF0F\",\"是否启用\":true}},{\"recordId\":\"reccFTgZWq\",\"fields\":{\"二维码\":\"https://res.pandateacher.com/7LYFZBB31676131771013.jpg\",\"企微号\":\"吴枫和他的朋友公众号\",\"是否启用\":false}},{\"recordId\":\"recoCnizVv\",\"fields\":{\"二维码\":\"https://res.pandateacher.com/Y1RLC3N41676532031534.png\",\"企微号\":\"吴枫老师☀️\",\"是否启用\":true}},{\"recordId\":\"recQV4b6yq\",\"fields\":{\"二维码\":\"https://res.pandateacher.com/2CNBTZ6R1676532378306.png\",\"企微号\":\"吴枫老师\",\"是否启用\":true}},{\"recordId\":\"recIjFzNCL\",\"fields\":{\"企微号\":\"吴枫老师\uD83C\uDF15\"}},{\"recordId\":\"recQt9Hkhp\",\"fields\":{\"二维码\":\"https://res.pandateacher.com/24UOCN4E1676532153449.png\",\"企微号\":\"吴枫老师\uD83D\uDC1A\",\"是否启用\":false}},{\"recordId\":\"recwjQZqcl\",\"fields\":{\"二维码\":\"https://res.pandateacher.com/7WU92KUH1676126958543.png\",\"企微号\":\"吴枫老师\uD83C\uDFB6\",\"是否启用\":false}},{\"recordId\":\"recZBaXsYJ\",\"fields\":{\"二维码\":\"https://res.pandateacher.com/TA2K4YO71676974413515.png\",\"企微号\":\"吴枫老师\uD83D\uDE80\",\"是否启用\":true}},{\"recordId\":\"recZOI4vBb\",\"fields\":{\"二维码\":\"https://res.pandateacher.com/TF886YXD1677047174531.png\",\"企微号\":\"吴枫老师\uD83E\uDE90\"}}],\"code\":0,\"message\":\"success\"}";
        }
        if(key.equals("chat-gpt-aigcfun-site"))
        {
            text ="{\"data\":[{\"recordId\":\"recUlJsJtT\",\"fields\":{\"key\":\"landingUrl\",\"value\":\"https://aigcfun.com/app-download\",\"配置名\":\"落地页\"}},{\"recordId\":\"recvFY5KwD\",\"fields\":{\"key\":\"landingQRcode\",\"备注\":\"用于PC端展示落地页二维码使用，如果不需要展示则不填\",\"配置名\":\"落地页二维码\"}},{\"recordId\":\"rec2w5MnNT\",\"fields\":{\"key\":\"diversionText\",\"value\":\"\uD83D\uDD25下载 APP，解锁更多 AI 能力\",\"配置名\":\"\uD83D\uDD25文案\"}},{\"recordId\":\"rec622lQB8\",\"fields\":{\"key\":\"freeChatCount\",\"value\":\"-1\",\"配置名\":\"免费访问次数\"}},{\"recordId\":\"rec2LAC7eG\",\"fields\":{\"key\":\"includeError\",\"value\":\"true\",\"备注\":\"空表示不包含，true 表示包含\",\"配置名\":\"访问次数包含错误情况\"}},{\"recordId\":\"recy4xzPcL\",\"fields\":{\"key\":\"flowFreeChatCount\",\"value\":\"-1\",\"配置名\":\"登录免费访问次数\"}},{\"recordId\":\"reckNmVDId\",\"fields\":{\"key\":\"flowModalTips\",\"value\":\"当前服务器负载已满，加我第一时间获得可用通知\",\"配置名\":\"限制弹窗提示语\"}},{\"recordId\":\"recacpxzjk\",\"fields\":{\"key\":\"loginModalTips\",\"value\":\"当前站点通道需要在登录后才能无限制使用\",\"配置名\":\"登录弹窗提示语\"}},{\"recordId\":\"rec8zHSJlV\",\"fields\":{\"key\":\"cacheTimes\",\"value\":\"10\"}},{\"recordId\":\"recIRmTisc\",\"fields\":{\"key\":\"maxPromptTokens\",\"value\":\"3000\"}},{\"recordId\":\"recVJUkf4I\",\"fields\":{\"key\":\"footerHtml\",\"value\":\"本站点基于国内API混合开发，仅供学习 AI 使用，使用前请知晓 <a href=\\\"https://res.pandateacher.com/disclaimer_ai_edu.html\\\" target=\\\"_blank\\\" rel=\\\"noreferrer\\\" style=\\\"text-decoration-line:underline\\\">免责申明</a> \",\"备注\":\"“ 抢走你工作的不会是 AI ，而是先掌握 AI 能力的人 ”\",\"配置名\":\"底部文案配置\"}},{\"recordId\":\"recuekVU9G\",\"fields\":{\"key\":\"titile\",\"value\":\"FORCHANGE AI EDU\",\"配置名\":\"站点标题\"}},{\"recordId\":\"rec3BWQwOQ\",\"fields\":{\"key\":\"protocol\",\"value\":\"https://www.pypypy.cn/web/passport/#/protocol\",\"备注\":\"app用\",\"配置名\":\"隐私协议\"}},{\"recordId\":\"recZqNVOLh\",\"fields\":{\"key\":\"privacy\",\"value\":\"https://www.pypypy.cn/web/passport/#/privacy\",\"备注\":\"app用\",\"配置名\":\"隐私政策\"}},{\"recordId\":\"recsnyrIr9\",\"fields\":{\"key\":\"disclaimer\",\"value\":\"https://res.pandateacher.com/disclaimer_ai_edu.html\",\"备注\":\"app用\",\"配置名\":\"免责申明\"}},{\"recordId\":\"recOsdRO1U\",\"fields\":{\"key\":\"contactUs\",\"value\":\"https://cleword.cn/system/public/shrworRoU4Z0wLmG6B1hPlmU\",\"备注\":\"app用\",\"配置名\":\"联系我们（更多AI玩法）\"}},{\"recordId\":\"recF7EMqN8\",\"fields\":{\"key\":\"suggestion\",\"value\":\"[{\\\"title\\\":\\\"提问 & 解释\\\",\\\"values\\\":[\\\"用简单的术语解释人工智能\\\",\\\"有哪些有趣的科学实验\\\",\\\"春天适合去哪里旅行\\\"]},{\\\"title\\\":\\\"创作\\\",\\\"values\\\":[\\\"写一首赞美祖国的诗\\\",\\\"写一篇科幻小说\\\",\\\"用Python写一个猜数字的游戏并运行它\\\"]},{\\\"title\\\":\\\"翻译\\\",\\\"values\\\":[\\\"用英语说“今天的天气怎么样”\\\",\\\"法语中的“你好”怎么说\\\"]},{\\\"title\\\":\\\"美食\\\",\\\"values\\\":[\\\"莲藕排骨汤的做法\\\",\\\"怎么煎牛排\\\"]},{\\\"title\\\":\\\"趣味\\\",\\\"values\\\":[\\\"如何问一个让ai也答不出的问题\\\",\\\"AI 会替代人类工作吗\\\"]}]\",\"备注\":\"app用\",\"配置名\":\"建议\"}},{\"recordId\":\"recKPl5fjP\",\"fields\":{\"key\":\"shutdown\",\"备注\":\"空表示不关，true 表示包含\",\"配置名\":\"拉闸\"}},{\"recordId\":\"recHcGcz9q\",\"fields\":{\"key\":\"examplesIcon\",\"value\":\"https://res.pandateacher.com/FYKMRCJW1676623387451.png\"}},{\"recordId\":\"rec1BhtKTb\",\"fields\":{\"key\":\"capabilitiesIcon\",\"value\":\"https://res.pandateacher.com/KL2ZWEHE1676623387366.png\"}},{\"recordId\":\"rec9Rjc17o\",\"fields\":{\"key\":\"limitationsIcon\",\"value\":\"https://res.pandateacher.com/N2QWAMEQ1676626012268.png\"}},{\"recordId\":\"rec4IlQb0T\",\"fields\":{\"key\":\"generateTitle\",\"value\":\"true\",\"配置名\":\"让ai根据对话自动生成标题\"}},{\"recordId\":\"recjHEuZvf\",\"fields\":{\"key\":\"API_HOST\",\"value\":\"https://api.forchange.cn/\",\"配置名\":\"APP API 接口地址\"}},{\"recordId\":\"rect2nSQTD\",\"fields\":{\"key\":\"API_HOST_WEB\",\"value\":\"https://api.aioschat.com\",\"配置名\":\"Web API 接口地址\"}},{\"recordId\":\"recRKy5Jie\",\"fields\":{\"key\":\"API_HOST_SEARCH\",\"value\":\"https://api.aioschat.com\",\"配置名\":\"搜索 API 接口地址\"}},{\"recordId\":\"recwNp6DYI\",\"fields\":{\"key\":\"API_HOST_IMAGE\",\"value\":\"https://api.forchange.cn/\"}},{\"recordId\":\"recqEEEhwO\",\"fields\":{\"key\":\"shareImageURL\",\"value\":\"https://res.pandateacher.com/AEVWBDYZ1678166029185.jpg\"}},{\"recordId\":\"recbzpaFjK\",\"fields\":{\"key\":\"shareTips\"}},{\"recordId\":\"rec98OwrBM\",\"fields\":{\"key\":\"shareFlag\",\"value\":\"true\"}},{\"recordId\":\"rec7YYjh8y\",\"fields\":{\"key\":\"API_HOST_WEB_PRO\",\"value\":\"https://api.aigcfun.com\",\"配置名\":\"需带key请求的Web API 接口地址\"}},{\"recordId\":\"recL7d7hTY\",\"fields\":{\"key\":\"apiKeyEnable\",\"value\":\"false\",\"备注\":\"若需关闭设为空即可\",\"配置名\":\"API KEY相关功能功能开关\"}},{\"recordId\":\"recEvWGHWb\",\"fields\":{\"key\":\"gainApiModalTips\",\"value\":\"扫码添加微信，获取你的专属API KEY\",\"配置名\":\"获取API KEY弹窗提示语\"}}],\"code\":0,\"message\":\"success\"}";
        }
        if(key.equals("chat-gpt-aigcfun-tabs"))
        {
            text="{\"data\":[{\"recordId\":\"recPB8nzNX\",\"fields\":{\"name\":\"更多AI玩法\",\"url\":\"https://cleword.cn/system/public/shrworRoU4Z0wLmG6B1hPlmU\"}},{\"recordId\":\"rec5oWszeL\",\"fields\":{\"name\":\"下载 App\",\"url\":\"https://aigcfun.com/app-download\"}},{\"recordId\":\"recFhnpZM0\",\"fields\":{\"name\":\"免责申明\",\"url\":\"https://res.pandateacher.com/disclaimer_ai_edu.html\"}}],\"code\":0,\"message\":\"success\"}";
        }
        if(key.equals("chat-gpt-home"))
        {
            text="{\"data\":[{\"recordId\":\"recvpzYX0o\",\"fields\":{\"isExample\":true,\"text\":\"写一首赞美祖国的诗\",\"type\":\"AI 创作\"}},{\"recordId\":\"recW6tVmD2\",\"fields\":{\"isExample\":true,\"text\":\"写一篇科幻小说\",\"type\":\"AI 创作\"}},{\"recordId\":\"recErs18gj\",\"fields\":{\"isExample\":true,\"text\":\"用Python写一个猜数字的游戏并运行它\",\"type\":\"AI 创作\"}},{\"recordId\":\"recQUZFaCZ\",\"fields\":{\"isExample\":true,\"text\":\"有哪些有趣的科学实验\",\"type\":\"有趣的提问\"}},{\"recordId\":\"rectOhuOdl\",\"fields\":{\"isExample\":true,\"text\":\"如何问一个让 AI 也答不出的问题\",\"type\":\"有趣的提问\"}},{\"recordId\":\"rec4Z3pFnk\",\"fields\":{\"isExample\":true,\"text\":\"Ai 会替代人类工作吗？\",\"type\":\"有趣的提问\"}},{\"recordId\":\"reciiu0yjo\",\"fields\":{\"isExample\":true,\"text\":\"用简单的术语来解释人工智能\",\"type\":\"AI 百科\"}},{\"recordId\":\"rec0rvTvrK\",\"fields\":{\"isExample\":true,\"text\":\"莲藕排骨汤的做法\",\"type\":\"AI 百科\"}},{\"recordId\":\"recVOxtyAv\",\"fields\":{\"isExample\":true,\"text\":\"EDU 是什么意思\",\"type\":\"AI 百科\"}}],\"code\":0,\"message\":\"success\"}";
        }
        return text;
    }

}
