# RoadBox Ubíquo  

## Sobre o Projeto  
O **RoadBox Ubíquo** é um sistema inteligente projetado para detectar acidentes de trânsito em tempo real. Utilizando sensores em dispositivos móveis, câmeras inteligentes e uma arquitetura de processamento distribuído em nuvem, ele melhora a segurança viária ao fornecer notificações rápidas e relatórios detalhados.  

---

## Funcionalidades  
- **Detecção em Tempo Real:** Identifica acidentes com base em dados de sensores e câmeras.  
- **Análise Local e na Borda:** Reduz latência ao processar dados próximos à origem.  
- **Integração com a Nuvem:** Consolida informações e gera insights estratégicos.  
- **Escalabilidade:** Fácil integração de novos dispositivos e sensores.  

---

## Arquitetura  
A solução está dividida em três camadas principais:  

1. **Camada Local (Mobile):**  
   - Captura dados de acelerômetro, GPS e outros sensores.  
   - Envia alertas para as câmeras usando **MQTT**.  

2. **Camada de Borda (Câmeras Inteligentes):**  
   - Processa imagens e som em tempo real com IA.  
   - Confirma eventos críticos e envia dados para a nuvem.  

3. **Camada de Nuvem:**  
   - Consolida informações de múltiplas fontes.  
   - Executa análises avançadas e gera relatórios detalhados.  

---

## Tecnologias Utilizadas  
- **IoT:** Sensores móveis e câmeras inteligentes.  
- **Protocolo de Comunicação:** **MQTT** e **HTTP**.  
- **Inteligência Artificial:** Para reconhecimento de padrões em imagens e eventos.  
- **Arquitetura SOA:** Escalabilidade e modularidade para integração de serviços. 
