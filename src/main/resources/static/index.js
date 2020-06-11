// (() => {
//     const sciencePlan = [];
//     let selectedSciencePlan;
//
//     const API_URL = '//localhost:8443';
//
//     const login = async (username, pwd) => {
//         const res = await fetch(${API_URL}/sciencePlan/getplan,
//             {
//             method: 'GET',
//
//             headers: {
//                 'Content-Type': 'application/json'
//             }
//         })
//         return res.json()
//     }
// })

(() => {
    const login = async (username, pwd) => {
        const res = await fetch(`${API_URL}/sciencePlan/getplan`,
            {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        return res.json()
    }
})

    // const submitPlan = async (id, uid) => {
    //     return await fetch(`${API_URL}/api/scienceplan/submit?id=${id}&uid=${uid}`, {
    //         method: 'GET',
    //         headers: {
    //             'Authorization': `Bearer ${getToken()}`
    //         }
    //     })
    // }
