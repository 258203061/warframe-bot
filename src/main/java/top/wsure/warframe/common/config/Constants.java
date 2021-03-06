package top.wsure.warframe.common.config;

import org.meowy.cqp.jcq.message.CQCode;
import top.wsure.warframe.common.annotation.BotApiAfterDo;
import top.wsure.warframe.common.cache.CacheListener;
import top.wsure.warframe.common.cache.CacheManagerImpl;
import top.wsure.warframe.entity.CommandDo;
import top.wsure.warframe.entity.RobotConfigDo;
import top.wsure.warframe.common.enums.CacheEnum;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileName: Constants
 * Author:   Administrator
 * Date:     2020-4-5
 * Description: 常量
 */
public class Constants {

    public static CQCode CC = new CQCode();
    public static CacheListener listener = new CacheListener();
//    public static CacheManagerImpl warFrameCache = new CacheManagerImpl(CacheEnum.WARFRAME_CACHE.getName());
//    public static CacheManagerImpl messageCache = new CacheManagerImpl(CacheEnum.MESSAGE_CACHE.getName());
    public static RobotConfigDo ROBOT_CONFIG ;
    public static List<CommandDo> ROBOT_COMMANDS ;
    public static Map<String , List<Method>> botEventMap = new HashMap<>();
    public static Map<String , List<Class<?>>> botApiAfterMap = new HashMap<>();
    public static Map<String , List<Class<?>>> botApiBeforeMap = new HashMap<>();

}
