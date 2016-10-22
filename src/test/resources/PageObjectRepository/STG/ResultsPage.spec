Page Title: Search

#Object Definitions
====================================================================================
area_searchResult           css      #b_content
txt_resultCount             xpath    //span[@class='sb_count' and contains(text(),'results')]
verifyResult            xpath           ((//a[contains(@href,'buying-guide')])[2]/..//h1//span[span])[2]
firstImage              xpath            (//a[contains(@href,'tracker=search')]//img)[1]
====================================================================================