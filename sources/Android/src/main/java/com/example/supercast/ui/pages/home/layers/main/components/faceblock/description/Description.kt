// Home page - Main layer - Face block - Description

package com.example.supercast.ui.pages.home.layers.main.components.faceblock.description

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.common.spaces.Height

import com.example.supercast.ui.components.layers.mainlayer.switcher.Switcher
import com.example.supercast.ui.components.layers.mainlayer.descriptionblock.DescriptionBlock



private const val textSwitch_1 = "Описание"
private const val textSwitch_2 = "Об авторе"



@Composable
fun Description () {

    Column (
        modifier = Modifier.fillMaxWidth ()
    ) {

        // • sample data

        val data_1 = arrayOf (
            arrayOf (
                "Основное",
                "На этом канале видео про политику, урбанистику, государственное управление. Стараюсь их делать спокойными и обоснованными научными данными.  По вопросам рекламы пишите на ads@maximkatz.com  Я Максим Кац, 10 лет занимаюсь оппозиционной политикой: сам был депутатом, управлял многими оппозиционными избирательными кампаниями — от штаба Навального в 2013 до кампании Брюхановой в 2021. Хочу сделать Россию лучше и избраться мэром Москвы когда-нибудь :)"
            ),
            arrayOf (
                "Ссылки",
                "instagram: leahhalton\ntiktok: https://vm.tiktok.com/ZMJSTVwqE/\nsnapchat: leahhaltonn"
            )
        )

        val data_2 = arrayOf (
            arrayOf (
                "Что я делаю?",
                "Конец года — это период, когда Россия сталкивается с дефицитом свежих фруктов и овощей, за исключением мандаринов. Мандарины поставляются на российский рынок в огромных количествах, что делает их идеальным выбором для удовлетворения потребностей в витаминах и полезных элементах для иммунитета и организма в целом."
            ),
            arrayOf (
                "Чего я не знаю?",
                "Самые крупные зарубежные поставщики мандаринов в Россию — Испания, Израиль, Абхазия, Китай, Турция и Марокко. Страна, несмотря на наличие собственного производства, занимает лидирующие позиции по импорту фрукта. Мандарины отправляют в магазины уже в конце ноября, чтобы реализовать их к новогодним праздникам, когда спрос наивысший."
            ),
            arrayOf (
                "Я хочу быть собой",
                "Мандарины, выращенные в России, произрастают на Северном Кавказе и в ряде городов Краснодарского края. Условия для их выращивания далеки от идеальных, что приводит к задержке созревания и появлению плодов в магазинах только под конец декабря. Чем дольше мандарин находится на дереве, тем слаще он становится, но российские условия могут стать губительными из-за морозов, которые могут погубить урожай."
            ),
            arrayOf (
                "Я хочу быть свободным",
                "Сроки созревания мандаринов зависят от многих факторов, включая климатические условия, погодные явления, уход и характеристики сорта. Самые ранние мандарины, доступные в октябре, редко производятся в промышленном масштабе. Поздние сорта, появляющиеся в ноябре — декабре, обладают более сладким и насыщенным вкусом."
            ),
            arrayOf (
                "Покой",
                "Дерево небольшого размера, обычно не превышающее в высоту 4 м; к 30 годам, однако, может достичь пятиметровой высоты (урожай с такого дерева составляет 5—7 тысяч плодов за один сезон)"
            )
        )

        // • sample data


        val (chosenSwitch, setChosenSwitch) = remember {mutableStateOf (textSwitch_2)}
        var contentOfSwitch by remember {mutableStateOf (if (chosenSwitch == textSwitch_1) data_1 else data_2)}

        contentOfSwitch = if (chosenSwitch == textSwitch_1) data_1 else data_2


        Switcher (
            switch_1 = textSwitch_1,
            switch_2 = textSwitch_2,
            chosenSwitch = chosenSwitch,
            setChosenSwitch = setChosenSwitch
        )

        DescriptionBlock (
            data = contentOfSwitch
        )

        Height (24)

    }

}