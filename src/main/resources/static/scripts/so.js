function showAllSO(){
    if($("#tableAllSO").css("display") == "none"){
        $("#tableAllSO").css("display", "block");
    }
    else{
        $("#tableAllSO").css("display", "none");
    }
}
function showModalGS(userName,GrandSmetaVersion){
    $("#userName").empty();
    $("#gs").empty();
    $("#divModalChangeGS").bPopup();
    $("#userName").text(userName);
    if(GrandSmetaVersion != null){
        $("#gs").append(GrandSmetaVersion.softVersion);
    }
    else{
        $("#gs").append("Нет данных");
    }
}