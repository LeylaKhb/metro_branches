package com.habibullina.Task1;

import com.google.gson.Gson;
import com.habibullina.Task1.models.route_list_with_way_points.InboundData;
import org.junit.jupiter.api.Test;

//@SpringBootTest
class Task1ApplicationTests {

	@Test
	void contextLoads() {
		String testData = """
				{
				   "user_orders":  [{
				\t\t"id": 46298,
				\t"user": {
				\t\t"id": 1907,
				\t\t"metro_station": {
				\t\t\t"id": 182,
				\t\t\t"title": "Дубровка",
				\t\t\t"metro_branch_id": 11
				\t\t}
				\t}
				}, {
				\t"id": 46304,
				\t"user": {
				\t\t"id": 201
				\t}
				}, {
				\t"id": 46302,
				\t"user": {
				\t\t"id": 1003
				\t}
				}, {
				\t"id": 46306,
				\t"user": {
				\t\t"id": 201
				\t}
				}, {
				\t"id": 46307,
				\t"user": {
				\t\t"id": 38,
				\t\t"metro_station": {
				\t\t\t"id": 163,
				\t\t\t"title": "Новослободская ",
				\t\t\t"metro_branch_id": 20
				\t\t}
				\t}
				}]
				,
				"metro_branches_dictionary": [{
				\t"id": 17,
				\t"name": "Синяя лево",
				\t"metro_stations": [{
				\t\t"id": 5,
				\t\t"title": "Кунцевская "
				\t}, {
				\t\t"id": 6,
				\t\t"title": "Смоленская "
				\t}, {
				\t\t"id": 11,
				\t\t"title": "Арбатская "
				\t}, {
				\t\t"id": 12,
				\t\t"title": "Киевская "
				\t}, {
				\t\t"id": 13,
				\t\t"title": "Студенческая "
				\t}, {
				\t\t"id": 14,
				\t\t"title": "Кутузовская "
				\t}, {
				\t\t"id": 15,
				\t\t"title": "Парк Победы "
				\t}, {
				\t\t"id": 16,
				\t\t"title": "Багратионовская "
				\t}, {
				\t\t"id": 17,
				\t\t"title": "Славянский бульвар "
				\t}, {
				\t\t"id": 24,
				\t\t"title": "Пятницкое шоссе "
				\t}, {
				\t\t"id": 170,
				\t\t"title": "Митино "
				\t}, {
				\t\t"id": 171,
				\t\t"title": "Волоколамская "
				\t}, {
				\t\t"id": 172,
				\t\t"title": "Мякинино "
				\t}, {
				\t\t"id": 173,
				\t\t"title": "Строгино "
				\t}, {
				\t\t"id": 174,
				\t\t"title": "Крылатское "
				\t}, {
				\t\t"id": 175,
				\t\t"title": "Молодежная "
				\t}, {
				\t\t"id": 179,
				\t\t"title": "Пионерская"
				\t}, {
				\t\t"id": 180,
				\t\t"title": "Филевский парк "
				\t}, {
				\t\t"id": 181,
				\t\t"title": "Фили "
				\t}]
				}, {
				\t"id": 16,
				\t"name": "Синяя право",
				\t"metro_stations": [{
				\t\t"id": 7,
				\t\t"title": "Щелковская "
				\t}, {
				\t\t"id": 8,
				\t\t"title": "Первомайская "
				\t}, {
				\t\t"id": 216,
				\t\t"title": "Измайловская "
				\t}, {
				\t\t"id": 217,
				\t\t"title": "Партизанская "
				\t}, {
				\t\t"id": 218,
				\t\t"title": "Семёновская "
				\t}, {
				\t\t"id": 219,
				\t\t"title": "Электрозаводская "
				\t}, {
				\t\t"id": 220,
				\t\t"title": "Курская "
				\t}, {
				\t\t"id": 229,
				\t\t"title": "Бауманская "
				\t}, {
				\t\t"id": 230,
				\t\t"title": ""
				\t}]
				}, {
				\t"id": 15,
				\t"name": "Желтая низ",
				\t"metro_stations": [{
				\t\t"id": 71,
				\t\t"title": "Деловой центр "
				\t}, {
				\t\t"id": 72,
				\t\t"title": "Парк победы"
				\t}, {
				\t\t"id": 73,
				\t\t"title": "Минская "
				\t}, {
				\t\t"id": 74,
				\t\t"title": "Ломоносовский проспект "
				\t}, {
				\t\t"id": 75,
				\t\t"title": "Раменки "
				\t}, {
				\t\t"id": 76,
				\t\t"title": "Мичуринский проспект "
				\t}, {
				\t\t"id": 77,
				\t\t"title": "Озёрная "
				\t}, {
				\t\t"id": 78,
				\t\t"title": "Говорово "
				\t}, {
				\t\t"id": 79,
				\t\t"title": "Солнцево "
				\t}, {
				\t\t"id": 80,
				\t\t"title": "Боровское шоссе "
				\t}, {
				\t\t"id": 81,
				\t\t"title": "Новопеределкино "
				\t}, {
				\t\t"id": 82,
				\t\t"title": "Рассказовка "
				\t}]
				}, {
				\t"id": 14,
				\t"name": "Желтая верх",
				\t"metro_stations": [{
				\t\t"id": 83,
				\t\t"title": "Марксистская "
				\t}, {
				\t\t"id": 84,
				\t\t"title": "Площадь Ильича "
				\t}, {
				\t\t"id": 85,
				\t\t"title": "Авиамоторная "
				\t}, {
				\t\t"id": 86,
				\t\t"title": "Шоссе Энтузиастов "
				\t}, {
				\t\t"id": 87,
				\t\t"title": "Перово "
				\t}, {
				\t\t"id": 88,
				\t\t"title": "Новогиреево "
				\t}, {
				\t\t"id": 89,
				\t\t"title": "Новокосино "
				\t}]
				}, {
				\t"id": 11,
				\t"name": "Салатовая низ",
				\t"metro_stations": [{
				\t\t"id": 182,
				\t\t"title": "Дубровка"
				\t}, {
				\t\t"id": 183,
				\t\t"title": "Кожуховская "
				\t}, {
				\t\t"id": 184,
				\t\t"title": "Печатники "
				\t}, {
				\t\t"id": 185,
				\t\t"title": "Волжская "
				\t}, {
				\t\t"id": 186,
				\t\t"title": "Люблино "
				\t}, {
				\t\t"id": 187,
				\t\t"title": "Братиславская "
				\t}, {
				\t\t"id": 188,
				\t\t"title": "Марьино "
				\t}, {
				\t\t"id": 189,
				\t\t"title": "Борисово "
				\t}, {
				\t\t"id": 190,
				\t\t"title": "Шипиловская "
				\t}, {
				\t\t"id": 191,
				\t\t"title": "Зябликово "
				\t}, {
				\t\t"id": 231,
				\t\t"title": "Римская "
				\t}]
				}, {
				\t"id": 10,
				\t"name": "Салатовая верх",
				\t"metro_stations": [{
				\t\t"id": 18,
				\t\t"title": "Селигерская "
				\t}, {
				\t\t"id": 19,
				\t\t"title": "Верхние Лихоборы "
				\t}, {
				\t\t"id": 20,
				\t\t"title": "Окружная "
				\t}, {
				\t\t"id": 21,
				\t\t"title": "Петровско-Разумовская "
				\t}, {
				\t\t"id": 22,
				\t\t"title": "Фонвизинская "
				\t}, {
				\t\t"id": 23,
				\t\t"title": "Бутырская "
				\t}, {
				\t\t"id": 176,
				\t\t"title": "Марьина Роща"
				\t}, {
				\t\t"id": 177,
				\t\t"title": "Достоевская "
				\t}, {
				\t\t"id": 178,
				\t\t"title": "Трубная "
				\t}]
				}, {
				\t"id": 9,
				\t"name": "Серая низ",
				\t"metro_stations": [{
				\t\t"id": 1,
				\t\t"title": "Старочкаловская "
				\t}, {
				\t\t"id": 2,
				\t\t"title": "Нагатинская "
				\t}, {
				\t\t"id": 90,
				\t\t"title": "Полянка"
				\t}, {
				\t\t"id": 91,
				\t\t"title": "Серпуховская "
				\t}, {
				\t\t"id": 92,
				\t\t"title": "Тульская "
				\t}, {
				\t\t"id": 93,
				\t\t"title": "Нагорная "
				\t}, {
				\t\t"id": 94,
				\t\t"title": "Нахимовский проспект "
				\t}, {
				\t\t"id": 95,
				\t\t"title": "Севастопольская "
				\t}, {
				\t\t"id": 96,
				\t\t"title": "Чертановская "
				\t}, {
				\t\t"id": 97,
				\t\t"title": "Южная "
				\t}, {
				\t\t"id": 98,
				\t\t"title": "Пражская "
				\t}, {
				\t\t"id": 99,
				\t\t"title": "Улица Академика Янгеля "
				\t}, {
				\t\t"id": 100,
				\t\t"title": "Аннино"
				\t}, {
				\t\t"id": 101,
				\t\t"title": "Бульвар Дмитрия Донского"
				\t}, {
				\t\t"id": 211,
				\t\t"title": "Лесопарковая "
				\t}, {
				\t\t"id": 212,
				\t\t"title": "Улица Скобелевская "
				\t}, {
				\t\t"id": 213,
				\t\t"title": "Улица Адмирала Ушакова "
				\t}, {
				\t\t"id": 214,
				\t\t"title": "Улица Горчакова "
				\t}, {
				\t\t"id": 215,
				\t\t"title": "Бунинская Аллея "
				\t}]
				}, {
				\t"id": 8,
				\t"name": "Серая верх",
				\t"metro_stations": [{
				\t\t"id": 102,
				\t\t"title": "Боровицкая "
				\t}, {
				\t\t"id": 103,
				\t\t"title": "Чеховская "
				\t}, {
				\t\t"id": 104,
				\t\t"title": "Цветной бульвар "
				\t}, {
				\t\t"id": 105,
				\t\t"title": "Менделеевская "
				\t}, {
				\t\t"id": 106,
				\t\t"title": "Савёловская "
				\t}, {
				\t\t"id": 107,
				\t\t"title": "Дмитровская "
				\t}, {
				\t\t"id": 108,
				\t\t"title": "Тимирязевская "
				\t}, {
				\t\t"id": 109,
				\t\t"title": "Петровско-Разумовская "
				\t}, {
				\t\t"id": 110,
				\t\t"title": "Владыкино "
				\t}, {
				\t\t"id": 111,
				\t\t"title": "Отрадное "
				\t}, {
				\t\t"id": 112,
				\t\t"title": "Бибирево "
				\t}, {
				\t\t"id": 113,
				\t\t"title": "Алтуфьево "
				\t}]
				}, {
				\t"id": 7,
				\t"name": "Фиолетовая верх ",
				\t"metro_stations": [{
				\t\t"id": 9,
				\t\t"title": "Октябрьское Поле"
				\t}, {
				\t\t"id": 10,
				\t\t"title": "Лубянка "
				\t}, {
				\t\t"id": 36,
				\t\t"title": "Кузнецкий мост "
				\t}, {
				\t\t"id": 37,
				\t\t"title": "Пушкинская "
				\t}, {
				\t\t"id": 38,
				\t\t"title": "Баррикадная "
				\t}, {
				\t\t"id": 39,
				\t\t"title": "Улица 1905 года "
				\t}, {
				\t\t"id": 40,
				\t\t"title": "Беговая "
				\t}, {
				\t\t"id": 41,
				\t\t"title": "Полежаевская "
				\t}, {
				\t\t"id": 42,
				\t\t"title": "Щукинская "
				\t}, {
				\t\t"id": 43,
				\t\t"title": "Спартак "
				\t}, {
				\t\t"id": 44,
				\t\t"title": "Тушинская "
				\t}, {
				\t\t"id": 45,
				\t\t"title": "Сходненская "
				\t}, {
				\t\t"id": 46,
				\t\t"title": "Планерная "
				\t}]
				}, {
				\t"id": 1,
				\t"name": "Фиолетовая низ ",
				\t"metro_stations": [{
				\t\t"id": 25,
				\t\t"title": "Котельники "
				\t}, {
				\t\t"id": 27,
				\t\t"title": "Лермонтовский проспект "
				\t}, {
				\t\t"id": 28,
				\t\t"title": "Выхино "
				\t}, {
				\t\t"id": 29,
				\t\t"title": "Рязанский проспект "
				\t}, {
				\t\t"id": 30,
				\t\t"title": "Кузьминки "
				\t}, {
				\t\t"id": 31,
				\t\t"title": "Текстильщики "
				\t}, {
				\t\t"id": 32,
				\t\t"title": "Волгоградский проспект "
				\t}, {
				\t\t"id": 33,
				\t\t"title": "Пролетарская "
				\t}, {
				\t\t"id": 34,
				\t\t"title": "Таганская "
				\t}, {
				\t\t"id": 35,
				\t\t"title": "Китай-город"
				\t}, {
				\t\t"id": 26,
				\t\t"title": "Жулебино"
				\t}]
				}, {
				\t"id": 6,
				\t"name": "Красная верх ",
				\t"metro_stations": [{
				\t\t"id": 114,
				\t\t"title": "Бульвар Рокоссовского"
				\t}, {
				\t\t"id": 115,
				\t\t"title": "Черкизовская "
				\t}, {
				\t\t"id": 116,
				\t\t"title": "Преображенская "
				\t}, {
				\t\t"id": 117,
				\t\t"title": "Сокольники "
				\t}, {
				\t\t"id": 118,
				\t\t"title": "Красносельская "
				\t}, {
				\t\t"id": 119,
				\t\t"title": "Комсомольская "
				\t}, {
				\t\t"id": 120,
				\t\t"title": "Красные ворота "
				\t}, {
				\t\t"id": 121,
				\t\t"title": "Чистые пруды "
				\t}, {
				\t\t"id": 122,
				\t\t"title": "Охотный Ряд "
				\t}, {
				\t\t"id": 123,
				\t\t"title": "Библиотека им. Ленина "
				\t}]
				}, {
				\t"id": 5,
				\t"name": "Красная низ ",
				\t"metro_stations": [{
				\t\t"id": 124,
				\t\t"title": "Кропоткинская "
				\t}, {
				\t\t"id": 125,
				\t\t"title": "Парк культуры "
				\t}, {
				\t\t"id": 126,
				\t\t"title": "Фрунзенская "
				\t}, {
				\t\t"id": 127,
				\t\t"title": "Спортивная "
				\t}, {
				\t\t"id": 128,
				\t\t"title": "Воробьевы горы "
				\t}, {
				\t\t"id": 129,
				\t\t"title": "Университет "
				\t}, {
				\t\t"id": 130,
				\t\t"title": "Проспект Вернадского "
				\t}, {
				\t\t"id": 131,
				\t\t"title": "Юго-западная "
				\t}, {
				\t\t"id": 132,
				\t\t"title": "Тропарево "
				\t}, {
				\t\t"id": 133,
				\t\t"title": "Румянцево "
				\t}, {
				\t\t"id": 134,
				\t\t"title": "Саларьево "
				\t}, {
				\t\t"id": 135,
				\t\t"title": "Филатов луг "
				\t}, {
				\t\t"id": 136,
				\t\t"title": "Прокшино "
				\t}, {
				\t\t"id": 137,
				\t\t"title": "Ольховая "
				\t}, {
				\t\t"id": 138,
				\t\t"title": "Коммунарка "
				\t}]
				}, {
				\t"id": 3,
				\t"name": "Оранжевая низ",
				\t"metro_stations": [{
				\t\t"id": 59,
				\t\t"title": "Шаболовская "
				\t}, {
				\t\t"id": 60,
				\t\t"title": "Ленинский проспект "
				\t}, {
				\t\t"id": 61,
				\t\t"title": "Академическая "
				\t}, {
				\t\t"id": 62,
				\t\t"title": "Профсоюзная "
				\t}, {
				\t\t"id": 63,
				\t\t"title": "Новые Черемушки "
				\t}, {
				\t\t"id": 64,
				\t\t"title": "Калужская "
				\t}, {
				\t\t"id": 65,
				\t\t"title": "Беляево "
				\t}, {
				\t\t"id": 66,
				\t\t"title": "Коньково "
				\t}, {
				\t\t"id": 67,
				\t\t"title": "Теплый стан "
				\t}, {
				\t\t"id": 68,
				\t\t"title": "Ясенево "
				\t}, {
				\t\t"id": 69,
				\t\t"title": "Новоясеневская "
				\t}, {
				\t\t"id": 70,
				\t\t"title": ""
				\t}]
				}, {
				\t"id": 2,
				\t"name": "Оранжевая верх",
				\t"metro_stations": [{
				\t\t"id": 47,
				\t\t"title": "Медведково "
				\t}, {
				\t\t"id": 48,
				\t\t"title": "Бабушкинская "
				\t}, {
				\t\t"id": 49,
				\t\t"title": "Свиблово "
				\t}, {
				\t\t"id": 50,
				\t\t"title": "Ботанический сад"
				\t}, {
				\t\t"id": 51,
				\t\t"title": "ВДНХ"
				\t}, {
				\t\t"id": 52,
				\t\t"title": "Алексеевская "
				\t}, {
				\t\t"id": 53,
				\t\t"title": "Рижская "
				\t}, {
				\t\t"id": 54,
				\t\t"title": "Проспект Мира "
				\t}, {
				\t\t"id": 55,
				\t\t"title": "Сухаревская "
				\t}, {
				\t\t"id": 56,
				\t\t"title": "Тургеневская "
				\t}, {
				\t\t"id": 57,
				\t\t"title": "Третьяковская "
				\t}, {
				\t\t"id": 58,
				\t\t"title": "Октябрьская "
				\t}]
				}, {
				\t"id": 18,
				\t"name": "Не доставляем ",
				\t"metro_stations": []
				}, {
				\t"id": 12,
				\t"name": "Зеленый верх",
				\t"metro_stations": [{
				\t\t"id": 139,
				\t\t"title": "Ховрино "
				\t}, {
				\t\t"id": 140,
				\t\t"title": "Беломорская "
				\t}, {
				\t\t"id": 141,
				\t\t"title": "Речной вокзал "
				\t}, {
				\t\t"id": 142,
				\t\t"title": "Водный стадион "
				\t}, {
				\t\t"id": 143,
				\t\t"title": "Войковская "
				\t}, {
				\t\t"id": 144,
				\t\t"title": "Сокол "
				\t}, {
				\t\t"id": 145,
				\t\t"title": "Аэропорт "
				\t}, {
				\t\t"id": 146,
				\t\t"title": "Динамо "
				\t}, {
				\t\t"id": 147,
				\t\t"title": "Белорусская "
				\t}, {
				\t\t"id": 221,
				\t\t"title": "Маяковская "
				\t}, {
				\t\t"id": 222,
				\t\t"title": "Тверская "
				\t}, {
				\t\t"id": 223,
				\t\t"title": ""
				\t}]
				}, {
				\t"id": 13,
				\t"name": "Зеленый низ",
				\t"metro_stations": [{
				\t\t"id": 3,
				\t\t"title": "Новокузнецкая "
				\t}, {
				\t\t"id": 4,
				\t\t"title": "Павелецкая "
				\t}, {
				\t\t"id": 148,
				\t\t"title": "Автозаводская "
				\t}, {
				\t\t"id": 149,
				\t\t"title": "Технопарк "
				\t}, {
				\t\t"id": 150,
				\t\t"title": "Коломенская "
				\t}, {
				\t\t"id": 151,
				\t\t"title": "Каширская "
				\t}, {
				\t\t"id": 152,
				\t\t"title": "Кантемировская "
				\t}, {
				\t\t"id": 153,
				\t\t"title": "Царицыно "
				\t}, {
				\t\t"id": 154,
				\t\t"title": "Орехово "
				\t}, {
				\t\t"id": 155,
				\t\t"title": "Домодедовская "
				\t}, {
				\t\t"id": 156,
				\t\t"title": "Красногвардейская "
				\t}, {
				\t\t"id": 157,
				\t\t"title": "Алма-Атинская "
				\t}]
				}, {
				\t"id": 20,
				\t"name": "Кольцевая ",
				\t"metro_stations": [{
				\t\t"id": 158,
				\t\t"title": "Октябрьская "
				\t}, {
				\t\t"id": 159,
				\t\t"title": "Парк культуры "
				\t}, {
				\t\t"id": 160,
				\t\t"title": "Киевская "
				\t}, {
				\t\t"id": 161,
				\t\t"title": "Краснопресненская "
				\t}, {
				\t\t"id": 162,
				\t\t"title": "Белорусская "
				\t}, {
				\t\t"id": 163,
				\t\t"title": "Новослободская "
				\t}, {
				\t\t"id": 164,
				\t\t"title": "Проспект Мира "
				\t}, {
				\t\t"id": 165,
				\t\t"title": "Комсомольская "
				\t}, {
				\t\t"id": 166,
				\t\t"title": "Курская "
				\t}, {
				\t\t"id": 167,
				\t\t"title": "Таганская "
				\t}, {
				\t\t"id": 168,
				\t\t"title": "Павелецкая "
				\t}, {
				\t\t"id": 169,
				\t\t"title": "Добрынинская "
				\t}]
				}, {
				\t"id": 21,
				\t"name": "Большая Кольцевая ",
				\t"metro_stations": [{
				\t\t"id": 192,
				\t\t"title": "Каховская "
				\t}, {
				\t\t"id": 193,
				\t\t"title": "Зюзино "
				\t}, {
				\t\t"id": 194,
				\t\t"title": "Новаторская "
				\t}, {
				\t\t"id": 195,
				\t\t"title": "Аминьевская "
				\t}, {
				\t\t"id": 196,
				\t\t"title": "Давыдково"
				\t}, {
				\t\t"id": 197,
				\t\t"title": "Терехово "
				\t}, {
				\t\t"id": 198,
				\t\t"title": "Мнёвники "
				\t}, {
				\t\t"id": 199,
				\t\t"title": "Народное ополчение "
				\t}, {
				\t\t"id": 200,
				\t\t"title": "ЦСКА "
				\t}, {
				\t\t"id": 201,
				\t\t"title": "Петровский парк "
				\t}, {
				\t\t"id": 227,
				\t\t"title": "Варшавская "
				\t}, {
				\t\t"id": 228,
				\t\t"title": "Хорошёвская"
				\t}]
				}, {
				\t"id": 22,
				\t"name": "Некрасовская линия ",
				\t"metro_stations": [{
				\t\t"id": 202,
				\t\t"title": "Некрасовка "
				\t}, {
				\t\t"id": 203,
				\t\t"title": "Лухмановская "
				\t}, {
				\t\t"id": 204,
				\t\t"title": "Улица Дмитриевского "
				\t}, {
				\t\t"id": 205,
				\t\t"title": "Лермонтовский проспект "
				\t}, {
				\t\t"id": 206,
				\t\t"title": "Юго-Восточная "
				\t}, {
				\t\t"id": 207,
				\t\t"title": "Окская "
				\t}, {
				\t\t"id": 208,
				\t\t"title": "Стахановская "
				\t}, {
				\t\t"id": 209,
				\t\t"title": "Авиамоторная "
				\t}, {
				\t\t"id": 210,
				\t\t"title": "Лефортово "
				\t}, {
				\t\t"id": 232,
				\t\t"title": "Нижегородская "
				\t}]
				}, {
				\t"id": 23,
				\t"name": "МЦК",
				\t"metro_stations": [{
				\t\t"id": 224,
				\t\t"title": "Верхние котлы "
				\t}, {
				\t\t"id": 225,
				\t\t"title": "ЗИЛ "
				\t}, {
				\t\t"id": 226,
				\t\t"title": "Крымская "
				\t}]
				}]
				}""";
		Gson gson = new Gson();
		InboundData x = gson.fromJson(testData, InboundData.class);
		InboundData y = gson.fromJson(testData, InboundData.class);
		System.out.println(x);
		System.out.println(y);
	}
}
