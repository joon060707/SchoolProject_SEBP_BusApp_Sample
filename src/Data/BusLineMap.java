package Data;

public class BusLineMap {

    public String idData;
    public String nameData;
    public String stopId;
    public String stopName;

    public BusLineMap(String idData, String nameData, String stopId, String stopName){
        this.idData=idData;
        this.nameData=nameData;
        this.stopId=stopId;
        this.stopName=stopName;
    }
}

/*
        9, 문흥18, 1165, 장등동
        9, 문흥18, 332, 도선사
        9, 문흥18, 545, 문흥지구입구(서)
        9, 문흥18, 2952, 문흥금호아파트
        9, 문흥18, 524, 문산중
        9, 문흥18, 539, 문흥1동행정복지센터
        9, 문흥18, 405, 샛터코아
        9, 문흥18, 1286, 문흥명지아파트
        9, 문흥18, 541, 문흥고가
        9, 문흥18, 84, 광주병원
        9, 문흥18, 532, 문화중
        9, 문흥18, 1483, 현대아파트
        9, 문흥18, 1250, 주공아파트
        9, 문흥18, 907, 전남대공과대학
        9, 문흥18, 1199, 전남대스포츠센터
        9, 문흥18, 1290, 효동초교입구
        9, 문흥18, 92, 광주역육교
        9, 문흥18, 1207, 전남대사거리(동)
        9, 문흥18, 1007, 용봉초교
        9, 문흥18, 867, 신안교
        9, 문흥18, 1299, 광주지방기상청
        9, 문흥18, 2657, 경신여고
        9, 문흥18, 2867, 운암시장
        9, 문흥18, 1060, 운암3단지
        9, 문흥18, 2990, 운암초교
        9, 문흥18, 2887, 서영대
        9, 문흥18, 1584, 동천우미린아파트
        9, 문흥18, 1273, 동천마을3단지
        9, 문흥18, 2889, 동천마을1단지
        9, 문흥18, 141, 동림I.C입구
        9, 문흥18, 66, 광신대교
        9, 문흥18, 2890, 풍영정입구
        9, 문흥18, 149, 극락강역입구
        9, 문흥18, 855, 신가동
        9, 문흥18, 1047, 목련마을
        9, 문흥18, 694, 목련마을6단지
        9, 문흥18, 1049, 운남삼성아파트
        9, 문흥18, 498, 광산구노인복지회관
        9, 문흥18, 974, 영천초교
        9, 문흥18, 1092, 월곡시장
        9, 문흥18, 1090, 월곡일신아파트
        9, 문흥18, 1252, 하남중
        9, 문흥18, 789, 역산공원입구
        9, 문흥18, 1389, 산정중입구
        9, 문흥18, 3849, 산정초교
        9, 문흥18, 3846, 다사로움1차아파트
        9, 문흥18, 3829, 하남2지구
        9, 문흥18, 6706, 하남1교
        9, 문흥18, 1424, 하남3지구모아엘가
        9, 문흥18, 3093, 광산소방서입구
        9, 문흥18, 3094, 세방전지
        9, 문흥18, 4235, 광주그린카진흥원입구
        9, 문흥18, 4193, 현대위아
        9, 문흥18, 4195, RTM
        9, 문흥18, 4197, 수호
        9, 문흥18, 4221, LG전자광주물류센터
        9, 문흥18, 4223, 케이엔
        9, 문흥18, 4239, 진곡산단
        9, 문흥18, 4240, 진곡산단
        9, 문흥18, 4224, 케이엔
        9, 문흥18, 4222, LG전자광주물류센터
        9, 문흥18, 4198, 수호
        9, 문흥18, 4196, RTM
        9, 문흥18, 4194, 현대위아
        9, 문흥18, 4236, 광주그린카진흥원입구
        9, 문흥18, 3088, 세방전지
        9, 문흥18, 1425, 광산소방서입구
        9, 문흥18, 2628, 하남3지구모아엘가
        9, 문흥18, 6707, 하남1교
        9, 문흥18, 3830, 하남2지구
        9, 문흥18, 3847, 다사로움1차아파트
        9, 문흥18, 3848, 산정초교
        9, 문흥18, 1390, 산정중입구
        9, 문흥18, 1251, 하남중
        9, 문흥18, 1089, 월곡일신아파트
        9, 문흥18, 1091, 월곡시장
        9, 문흥18, 1086, 영천초교
        9, 문흥18, 497, 광산구노인복지회관
        9, 문흥18, 1048, 운남삼성아파트
        9, 문흥18, 1053, 목련마을6단지
        9, 문흥18, 1046, 목련마을
        9, 문흥18, 854, 신가동
        9, 문흥18, 148, 극락강역입구
        9, 문흥18, 65, 풍영정입구
        9, 문흥18, 67, 광신대교
        9, 문흥18, 2893, 동림I.C입구
        9, 문흥18, 2894, 동천마을1단지
        9, 문흥18, 1272, 동천마을3단지
        9, 문흥18, 375, 동천우미린아파트
        9, 문흥18, 2895, 서영대
        9, 문흥18, 2991, 운암초교
        9, 문흥18, 1061, 운암3단지
        9, 문흥18, 1059, 운암벽산블루밍
        9, 문흥18, 529, 문화예술회관
        9, 문흥18, 2847, 운암시장
        9, 문흥18, 25, 경신여고
        9, 문흥18, 1300, 광주지방기상청
        9, 문흥18, 868, 신안교
        9, 문흥18, 1008, 용봉초교
        9, 문흥18, 1206, 전남대사거리(동)
        9, 문흥18, 94, 중흥삼거리
        9, 문흥18, 1410, 효동초교입구
        9, 문흥18, 2937, 북구차량등록민원실
        9, 문흥18, 1200, 전남대스포츠센터
        9, 문흥18, 908, 전남대공과대학
        9, 문흥18, 1249, 주공아파트
        9, 문흥18, 1482, 현대아파트
        9, 문흥18, 531, 문화중
        9, 문흥18, 85, 광주병원
        9, 문흥18, 540, 문흥고가
        9, 문흥18, 536, 문흥명지아파트
        9, 문흥18, 738, 샛터코아
        9, 문흥18, 538, 문흥1동행정복지센터
        9, 문흥18, 523, 문산중
        9, 문흥18, 2671, 문흥금호아파트
        9, 문흥18, 326, 문흥지구입구(동)
        9, 문흥18, 33, 도동고개
        9, 문흥18, 333, 도선사
        9, 문흥18, 1165, 장등동
*/