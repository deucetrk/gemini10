$(document).ready( function () {
    var table = $('#sciencePlanTable').DataTable({
        "sAjaxSource": "/getplan",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "planName"},
            { "mData": "creator" },
            { "mData": "fundingInUSD" },
            { "mData": "objectives" },
            { "mData": "startDate" },
            { "mData": "endDate" },
            { "mData": "teleLoc" },
            { "mData": "fileQuality" },
            { "mData": "contrast" },
            { "mData": "brightness" },
            { "mData": "saturation" },
            { "mData": "fileType" },
            { "mData": "colorType" },
            { "mData": "starSystem" }

        ]
    })
});