package com.dms.design.Observer.v1;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title Subject
 * @Author: dongms
 * @Date: 2024/5/27
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
