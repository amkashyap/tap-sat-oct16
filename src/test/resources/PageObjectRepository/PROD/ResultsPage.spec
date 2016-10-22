Page Title: Search

#Object Definitions
====================================================================================
area_searchResult           css      #b_content
txt_resultCount             xpath    //span[@class='sb_count' and contains(text(),'results')]
verifyText                  css             .search-keyword
firstImage              xpath               (//img[contains(@class,'product-image')])[1]
verifyResult            xpath               //*[contains(@class,'seach-msg-sec')]//*[contains(@class,'search-keyword')]
====================================================================================