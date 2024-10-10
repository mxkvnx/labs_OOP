/*
 * @(#)Admin.java 1.0 2024/10/10
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */

package ad231.neryanov.carshop.interfaces;

/**
 * Интерфейс Admin описывает методы, которые должны быть реализованы классами,
 * представляющими администраторов автомобильного магазина.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public interface Admin {
    /**
     * Метод для получения общего дохода магазина.
     *
     * @return общий доход магазина в виде числа с плавающей запятой
     */
    double getIncome();
}
