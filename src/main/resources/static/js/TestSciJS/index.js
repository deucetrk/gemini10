
const API_URL = '//localhost:8443';
async function getAllSciencePlan() {
    const result = await fetch(`${API_URL}/sciencePlan/getplan`);
    return await result.json();
}


async function updateSciStatus(id,status) {
  return await fetch(`${API_URL}/sciencePlan/updateStatus?id=${id}&status=${status}`, {
    method: 'PUT'
  });
}