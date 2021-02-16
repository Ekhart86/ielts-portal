package ru.ekhart86.views.b2wordlist;

import org.apache.commons.lang3.StringUtils;

public class WordParser {

    public static void main(String[] args) {
        printWordsList("343 alter [ˈɔːltə] изменять\n" +
                "alteration [ˌɔːltəˈreɪʃ(ə)n] внесение изменений alterable [ˈɔːltərəbl] изменяемый unaltered [ʌn\n" +
                "ˈɔːltəd] неизменный unalterable [ʌnˈɔːltərəbl] непреложный 344 pound [paʊnd] фунт 345 seat [siːt]\n" +
                "место, сиденье 346 candy [ˈkændi] конфеты 347 meanwhile [ˈmiːnˈwaɪl] тем временем 348 railway\n" +
                "[ˈreɪlweɪ] железная дорога railroad [ˈreɪlrəʊd] железная дорога 349 closet [ˈklɒzɪt] стенной шкаф 350\n" +
                "violate [ˈvaɪəleɪt] нарушать violation [ˌvaɪəˈleɪʃən] нарушение violator [ˈvaɪəleɪtə] нарушитель,\n" +
                "преступник 351 front [frʌnt] перед, передний in front of [ɪnfrʌntɒv] перед frontal [ˈfrʌntl]\n" +
                "передний, лобовой 352 take care [teɪkkeə] позаботиться, заняться caretaker [ˈkeəˌteɪkə] смотритель\n" +
                "353 authorities [ɔːˈθɒrɪtiz] органы власти 354 matter [ˈmætə] дело, вопрос 355 thank [θæŋk]\n" +
                "благодарить thankful [ˈθæŋkfʊl] благодарный thankless [ˈθæŋklɪs] неблагодарный 356 get through\n" +
                "[gɛtθruː] дозвониться 357 cup [kʌp] чашка, кружка, кубок 358 take off [teɪkɒf] снять 359 devote [dɪ\n" +
                "ˈvəʊt] посвятить, уделить devotion [dɪˈvəʊʃən] преданность 360 assume [əˈsjuːm] принимать на\n" +
                "себя assumption [əˈsʌmpʃ(ə)n] принятие 361 array [əˈreɪ] ряд, порядок, строй 362 shelter [ˈʃɛltə]\n" +
                "укрытие, убежище 363 contrary [ˈkɒntrəri] противоположный, вопреки 364 diminish [dɪˈmɪnɪʃ]\n" +
                "уменьшаться diminution [ˌdɪmɪˈnjuːʃən] снижение, сокращение 365 offer [ˈɒfə] предлагать,\n" +
                "предложение 366 set out [sɛtaʊt] разъяснять 367 complain [kəmˈpleɪn] жаловаться complaint [kəm\n" +
                "ˈpleɪnt] жалоба 368 favor (favour) [ˈfeɪvə] услуга 369 commitment [kəˈmɪtmənt] приверженность 370\n" +
                "intervene [ˌɪntə(ː)ˈviːn] вмешиваться intervention [ˌɪntə(ː)ˈvɛnʃən] вмешательство 371 error [ˈɛrə]\n" +
                "ошибка\n" +
                "erroneous\n" +
                "ошибочный 372 hike [haɪk] поход, ходить в поход hitchhike [ˈhɪʧˌhaɪk] автостоп 373 blink [blɪŋk]\n" +
                "мерцать, мигать\n" +
                "374 strip [strɪp] полоса, лента 375 curl [kɜːl] скручивать, клубиться, завиток curly [ˈkɜːli] кудрявый\n" +
                "376 concrete [ˈkɒnkriːt] бетон, бетонировать 377 fold [fəʊld] сворачивать, складывать 378 science\n" +
                "[ˈsaɪəns] наука scientific [ˌsaɪənˈtɪfɪk] научный scientist [ˈsaɪəntɪst] ученый 379 contest [ˈkɒntɛst]\n" +
                "соревнование, конкурс\n" +
                "contestant [kənˈtɛstənt] участник, конкурсант 380 bond [bɒnd] связь, узы, соединение 381 retreat [rɪ\n" +
                "ˈtriːt] отступать 382 suspend [səsˈpɛnd] приостановить, подвесить suspension [səsˈpɛnʃən]\n" +
                "приостановление\n" +
                "suspense [səsˈpɛns]\n" +
                "подвешенность, неопределённость suspended [səsˈpɛndɪd] отсроченный, условный (приговор) 383\n" +
                "fry [fraɪ] жарить 384 domestic [dəʊˈmɛstɪk] домашний domesticate [dəʊˈmɛstɪkeɪt] приручить,\n" +
                "одомашнить 385 ease [iːz] лёгкость, облегчать uneasy [ʌnˈiːzi] тревожный uneasiness [ʌnˈiːzɪnɪs]\n" +
                "тревожность 386 graduate [ˈgrædjʊət] выпускник, выпускаться undergraduate [ˌʌndəˈgrædjʊɪt]\n" +
                "студент graduation [ˌgrædjʊˈeɪʃən] выпуск postgraduate [ˌpəʊstˈgrædjʊɪt] аспирант 387 patch [pæʧ]\n" +
                "заплатка, латать 388 tire (tyre) [ˈtaɪə] шина 389 unless [ənˈlɛs] если не 390 shift [ʃɪft] сменить,\n" +
                "сдвинуть shifty [ˈʃɪfti] ловкий, изворотливый 391 hood [hʊd] капот, кожух 392 waste [weɪst] тратить\n" +
                "(впустую) wasteful [ˈweɪstfʊl] расточительный, разорительный 393 notice [ˈnəʊtɪs] заметить\n" +
                "unnoticed [ʌnˈnəʊtɪst] незамеченный 394 enormous [ɪˈnɔːməs] огромный 395 hook [hʊk] крюк,\n" +
                "зацеплять hooked [hʊkt] крючковатый, кривой 396 partisan [ˌpɑːtɪˈzæn] сторонник partisanship\n" +
                "[ˌpɑːtɪˈzænʃɪp] приверженность, поддержка 397 angry [ˈæŋgri] злой 398 measure [ˈmɛʒə] мера,\n" +
                "мероприятие 399 doubt [daʊt] сомневаться, сомнение doubtful [ˈdaʊtfʊl] сомнительныйdoubtless [ˈdaʊtlɪs] несомненный 400 stiff [stɪf] жёсткий, негнущийся stiffness [ˈstɪfnəs] жесткость\n" +
                "stiffen [ˈstɪfn] деревенеть\n" +
                "401 preach [priːʧ] проповедовать preacher [ˈpriːʧə] проповедник 402 come off [kʌmɒf] выйти,\n" +
                "получиться come of [kʌmɒv] получиться (как результат) 403 rail [reɪl] рельс, перила railing [ˈreɪlɪŋ]\n" +
                "перила derail [dɪˈreɪl] сходить с рельс 404 male [meɪl] мужской 405 female [ˈfiːmeɪl] женский 406\n" +
                "proof [pruːf] доказательство (неисч.) 407 produce [ˈprɒdjuːs] производить producer [prəˈdjuːsə]\n" +
                "производитель production [prəˈdʌkʃən] производство 408 matter [ˈmætə] иметь значение 409 tag\n" +
                "[tæg] этикетка, ярлык 410 subtle [ˈsʌtl] тонкий, неуловимый subtleness [ˈsʌtlnəs] тонкость subtlety\n" +
                "[ˈsʌtlti] тонкость 411 nurse [nɜːs] медсестра, нянька nursing [ˈnɜːsɪŋ] уход nursery [ˈnɜːsəri] дет.\n" +
                "ясли или питомник 412 wake (up) [weɪk] просыпаться или будить 413 soil [sɔɪl] почва 414 quiet\n" +
                "[ˈkwaɪət] тихий, спокойный, тишина quietness [ˈkwaɪətnɪs] спокойствие quieten [ˈkwaɪətn]\n" +
                "успокаивать 415 represent [ˌrɛprɪˈzɛnt] представлять representative [ˌrɛprɪˈzɛntətɪv] представитель\n" +
                "416 dispute [dɪsˈpjuːt] спор, спорить disputed [dɪsˈpjuːtɪd] спорный undisputed [ˌʌndɪsˈpjuːtɪd]\n" +
                "бесспорный, необсуждаемый 417 couch [kaʊʧ] диван 418 trade [treɪd] торговля, торговый trader\n" +
                "[ˈtreɪdə] трейдер, торговец 419 affair [əˈfeə] дело 420 term [tɜːm] срок, период long-term [ˈlɒŋtɜːm]\n" +
                "долгосрочный short-term [ʃɔːt-tɜːm] краткосрочный 421 give a ride [gɪvəraɪd] подвезти 422 as well\n" +
                "[æzwɛl] также 423 twist [twɪst] скручивать twisted [ˈtwɪstɪd] витой, закрученный, сплетённый 424\n" +
                "handle [ˈhændl] рукоятка 425 remain [rɪˈmeɪn] оставаться 426 take place [teɪkpleɪs] происходить,\n" +
                "бывать 427 upset [ʌpˈsɛt] расстроенный, расстраивать 428 inspect [ɪnˈspɛkt] проверять, осматривать\n" +
                "inspection [ɪnˈspɛkʃən] осмотр 429 authorize [ˈɔːθəraɪz] дать полномочия, поручение\n" +
                "authorized [ˈɔːʌəraɪzd] уполномоченный 430 pigeon [ˈpɪʤɪn] голубь 431 alert [əˈlɜːt] тревога,\n" +
                "бдительный alertness [əˈlɜːtnəs] настороженность on the alert [ɒnðiəˈlɜːt] начеку 432 increase [ɪn\n" +
                "ˈkriːs] увеличивать(ся) increase [ˈɪnkriːs] увеличение 433 decrease [diːˈkriːs] уменьшать(ся) decrease\n" +
                "[ˈdiːkriːs] снижение 434 inquire [ɪnˈkwaɪə] узнавать, интересоваться inquiry [ɪnˈkwaɪəri] запрос 435\n" +
                "false [fɔːls] ложный, неверный falsehood [ˈfɔːlshʊd] ложность falseness [ˈfɔːlsnɪs] фальшь 436 either\n" +
                "[ˈaɪðə] либо 437 echo [ˈɛkəʊ] эхо, отголосок, отражаться 438 stack [stæk] стопка, куча, складывать\n" +
                "439 label [ˈleɪbl] метка, ярлык, метить 440 neither [ˈnaɪðə] ни один из двух 441 sale [seɪl] продажа,\n" +
                "сбыт resale [ˌriːˈseɪl] перепродажа 442 bat [bæt] бита 443 flat [flæt] плоский, ровный flatten\n" +
                "[ˈflætn] расплющивать 444 limit [ˈlɪmɪt] ограничивать, ограничение 445 head off [hɛdɒf] выйти,\n" +
                "отправиться get off [gɛtɒf] уходить go off [gəʊɒf] уходить drive off [draɪvɒf] уехать (на машине)\n" +
                "walk off [wɔːkɒf] уходить 446 rural [ˈrʊərəl] сельский 447 compel [kəmˈpɛl] вынуждать, заставлять\n" +
                "448 boost [buːst] повышать, усиливать booster [ˈbuːstə] ускоритель, усилитель 449 grin [grɪn]\n" +
                "ухмыляться, ухмылка, оскал 450 tremendous [trɪˈmɛndəs] громадный, страшный 451 pad [pæd]\n" +
                "подушечка пальца, лапы 452 anticipate [ænˈtɪsɪpeɪt] ожидать anticipation [ænˌtɪsɪˈpeɪʃ(ə)n]\n" +
                "ожидание 453 pattern [ˈpætən] шаблон, образец 454 set smb up with [sɛtsmbʌpwɪð] устроить,\n" +
                "организовать 455 oven [ˈʌvn] печь, духовка microwave oven [ˈmaɪkrəʊweɪvˈʌvn] микроволновая\n" +
                "печь 456 anxious [ˈæŋkʃəs] озабоченный, встревоженный 457 shift [ʃɪft] смена (на работе) 458 meal\n" +
                "[miːl] еда 459 in advance [ɪnədˈvɑːns] заранее 460 further [ˈfɜːðə] дальнейший, далее furthermore\n" +
                "[ˈfɜːðəˈmɔː] более того\n" +
                "461 return [rɪˈtɜːn] возвращаться 462 chop down [ʧɒpdaʊn] срубить (дерево) 463 chop up [ʧɒpʌp]\n" +
                "порезать (на кусочки) cut up [kʌtʌp] порезать\n" +
                "464 prior [ˈpraɪə]\n" +
                "предварительный, предшествующий 465 silk [sɪlk] шёлк, шёлковый silky [ˈsɪlki] шелковистый 466\n" +
                "line [laɪn] строка 467 lap [læp] колени 468 bind (bound, bound) [baɪnd] связывать 469 mean [miːn]неважный, посредственный 470 reach [riːʧ] достичь reachable [ˈriːʧəbl] достижимый 471 once\n" +
                "[wʌns] однажды, когда-либо 472 vice [vaɪs] порок, недостаток vicious [ˈvɪʃəs] порочный 473 light (lit,\n" +
                "lit) [laɪt] зажигать lighter [ˈlaɪtə] зажигалка 474 occupy [ˈɒkjʊpaɪ] занимать 475 according to [ə\n" +
                "ˈkɔːdɪŋtuː] в соответствии accordingly [əˈkɔːdɪŋli] соответственно 476 out loud [aʊtlaʊd] вслух 477\n" +
                "alive [əˈlaɪv] живой 478 startle [ˈstɑːtl] испугать (неожиданностью) startling [ˈstɑːtlɪŋ]\n" +
                "поразительный 479 get [gɛt] становиться 480 catch (caught, caught) [kæʧ] ловить 481 shame [ʃeɪm]\n" +
                "стыд, позор shameful [ˈʃeɪmfʊl] постыдный shameless [ˈʃeɪmlɪs] бесстыдный 482 challenge\n" +
                "[ˈʧælɪnʤ] вызов, необычная задача challenging [ˈʧælɪnʤɪŋ] манящий, перспективный 483 mixture\n" +
                "[ˈmɪksʧə] смесь 484 endure [ɪnˈdjʊə] выдерживать endurable [ɪnˈdjʊərəbl] терпимый unendurable\n" +
                "[ˌʌnɪnˈdjʊərəbl] нестерпимый endurance [ɪnˈdjʊərəns] выносливость 485 board [bɔːd] совет,\n" +
                "коллегия boardroom [ˈbɔːdrʊm] зал заседаний 486 mate [meɪt] товарищ, компаньон classmate\n" +
                "[ˈklɑːsmeɪt] одноклассник roommate [ˈruːmmeɪt] сосед по комнате 487 compound [ˈkɒmpaʊnd]\n" +
                "состав, составной 488 bless [blɛs] благословлять blessing [ˈblɛsɪŋ] благословение 489 might [maɪt]\n" +
                "мощь mighty [ˈmaɪti] могущественный almighty [ɔːlˈmaɪti] всемогущий 490 variety [vəˈraɪəti]\n" +
                "разнообразие, множество\n" +
                "491 sole [səʊl] единственный 492 comprehensive [ˌkɒmprɪˈhɛnsɪv] исчерпывающий, всесторонний\n" +
                "493 heal [hiːl] лечить, заживать healer [ˈhiːlə] целитель 494 pipe [paɪp] труба pipeline [ˈpaɪplaɪn]\n" +
                "трубопровод pipework [pipe wɜːk] система трубопроводов 495 cool [kuːl] прохладный, свежий\n" +
                "coolness [ˈkuːlnɪs] прохлада, охлаждение 496 point [pɔɪnt] точка checkpoint [ˈʧɛkpɔɪnt] контрольная\n" +
                "точка, КПП 497 beg [bɛg] просить beggar [ˈbɛgə] нищий 498 spell [spɛl] заклинание, чары 499 paper\n" +
                "[ˈpeɪpə] бумага, документ wallpapers [ˈwɔːlˌpeɪpəz] обои 500 charm [ʧɑːm] обаяние, очаровывать\n" +
                "charming [ˈʧɑːmɪŋ] обаятельный 501 break out [breɪkaʊt] вспыхнуть, разразиться 502 heat [hiːt]\n" +
                "тепло, нагревать heating [ˈhiːtɪŋ] отопление heater [ˈhiːtə] обогреватель, нагреватель 503\n" +
                "particular [pəˈtɪkjʊlə] частный, конкретный particularly [pəˈtɪkjʊləli] в частности 504 score [skɔː] счёт,\n" +
                "очко, балл 505 combine [ˈkɒmbaɪn] соединять(ся) combination [ˌkɒmbɪˈneɪʃən] сочетание 506 mill\n" +
                "[mɪl] мельница или фабрика miller [ˈmɪlə] мельник windmill [ˈwɪnmɪl] ветряная мельница 507\n" +
                "move over [muːvˈəʊvə] подвинуться 508 rock [rɒk] камень, скала 509 fair [feə] светлый 510 fall for\n" +
                "[fɔːlfɔː] вестись 511 frank [fræŋk] откровенный frankness [ˈfræŋknəs] откровенность 512 rip [rɪp]\n" +
                "рвать 513 arrive [əˈraɪv] прибывать arrival [əˈraɪvəl] прибытие 514 amend [əˈmɛnd] исправить,\n" +
                "улучшить amendment [əˈmɛndmənt] поправка 515 crush [krʌʃ] раздавливать, дробить 516 accident\n" +
                "[ˈæksɪdənt] случайность accidental [ˌæksɪˈdɛntl] случайный 517 facility [fəˈsɪlɪti] сооружение, объект\n" +
                "518 means [miːnz] средство 519 focus [ˈfəʊkəs] сосредоточить (ся) 520 knock [nɒk] стучать 521 give\n" +
                "up [gɪvʌp] отказаться, сдаться");
    }

    public static void printWordsList(String word) {
        String[] spl = word.split("\\s+");
        for(String w : spl) {
            if(StringUtils.isNumeric(w)) {
                System.out.println();
            }
            System.out.print(w + " ");
        }
    }
}


